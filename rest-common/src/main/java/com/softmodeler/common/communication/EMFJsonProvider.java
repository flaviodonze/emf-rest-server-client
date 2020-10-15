package com.softmodeler.common.communication;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.TimeZone;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.module.paranamer.ParanamerModule;
import com.softmodeler.common.communication.ser.EMFDeserializers;
import com.softmodeler.common.communication.ser.EMFSerializers;
import com.softmodeler.common.communication.ser.EcoreJsonUtil;

public class EMFJsonProvider extends JacksonJaxbJsonProvider {

	private static TypeFactory typeFactory;

	private static TypeFactory getTypeFactory() {
		if (typeFactory == null) {
			typeFactory = TypeFactory.defaultInstance();
		}
		return typeFactory;
	}
	
	public static class IdResolver extends ClassNameIdResolver {

		public IdResolver() {
			super(getTypeFactory().constructSimpleType(Object.class, null), getTypeFactory(), BasicPolymorphicTypeValidator.builder().allowIfSubType(Object.class).build());
		}

		@Override
		public Id getMechanism() {
			return Id.CUSTOM;
		}

		@Override
		public JavaType typeFromId(DatabindContext ctxt, String id) throws IOException {
			if (!id.contains(".")) {
				// probably EMF object
				EClass classifier = EcoreJsonUtil.getEClass(id);
				if (classifier != null) {
					Class<?> instanceClass = classifier.getInstanceClass();
					return _typeFactory.constructSimpleType(instanceClass, null);
				}
			}
			return super.typeFromId(ctxt, id);
		}

		@Override
		public String idFromValue(Object value) {
			if (value instanceof EObject) {
				return ((EObject) value).eClass().getName();
			}
			if (value instanceof EList) {
				return ArrayList.class.getName();
			}
			return value.getClass().getName();
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CUSTOM, include = JsonTypeInfo.As.WRAPPER_ARRAY)
	@JsonTypeIdResolver(IdResolver.class)
	public class ObjectMixing {
		public ObjectMixing() {
		}
	}

	public EMFJsonProvider() {
		super();

		setMapper(setupMapper());
	}

	private ObjectMapper setupMapper() {
		JsonMapper.Builder builder = JsonMapper.builder();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH); // same as emf
		dateFormat.setTimeZone(TimeZone.getDefault());
		builder.defaultDateFormat(dateFormat);
		builder.defaultTimeZone(TimeZone.getDefault());
		
		builder.serializationInclusion(Include.ALWAYS);
		builder.defaultPropertyInclusion(JsonInclude.Value.construct(Include.ALWAYS, Include.ALWAYS));
		builder.visibility(PropertyAccessor.ALL, Visibility.NONE);
		builder.visibility(PropertyAccessor.FIELD, Visibility.ANY);
		builder.visibility(PropertyAccessor.CREATOR, Visibility.ANY);

		builder.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
		builder.configure(JsonWriteFeature.ESCAPE_NON_ASCII, true);
		builder.configure(SerializationFeature.WRAP_EXCEPTIONS, true);
		builder.configure(DeserializationFeature.WRAP_EXCEPTIONS, true);
		builder.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
		builder.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);

		PolymorphicTypeValidator ptv = BasicPolymorphicTypeValidator.builder().allowIfSubType(Object.class).build();
		builder.activateDefaultTyping(ptv, DefaultTyping.NON_FINAL);
		builder.typeFactory(getTypeFactory());		

		builder.addMixIn(Object.class, ObjectMixing.class);

		SimpleModule module = new SimpleModule("softmodeler", Version.unknownVersion()) {
			private static final long serialVersionUID = 2890805560707096019L;

			@Override
			public void setupModule(SetupContext context) {
				EMFDeserializers deserializers = new EMFDeserializers();
				EMFSerializers serializers = new EMFSerializers();

				context.addDeserializers(deserializers);
				context.addSerializers(serializers);
			}
		};
		builder.addModule(module);
		builder.addModule(new ParanamerModule());
		builder.addModule(new Jdk8Module());

		JsonMapper mapper = builder.build();
		return mapper;
	}
}
