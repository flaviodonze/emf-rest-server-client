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
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.TypeFactory;
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
			super(getTypeFactory().constructSimpleType(Object.class, null), getTypeFactory());
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
		ObjectMapper mapper = new ObjectMapper();

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH); // same as emf
		dateFormat.setTimeZone(TimeZone.getDefault());
		mapper.setDateFormat(dateFormat);
		mapper.setTimeZone(TimeZone.getDefault());

		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.setDefaultPropertyInclusion(Include.NON_NULL);
		mapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE);
		mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
		mapper.setVisibility(PropertyAccessor.CREATOR, Visibility.ANY);

		mapper.configure(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES, false);
		mapper.configure(Feature.ESCAPE_NON_ASCII, true);
		mapper.configure(SerializationFeature.WRAP_EXCEPTIONS, true);
		mapper.configure(DeserializationFeature.WRAP_EXCEPTIONS, true);
		mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
		mapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
		
		mapper.enableDefaultTyping(DefaultTyping.NON_FINAL);
		mapper.setTypeFactory(getTypeFactory());
		
		mapper.addMixIn(Object.class, ObjectMixing.class);

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
		mapper.registerModule(module);
		mapper.registerModule(new ParanamerModule());
		return mapper;
	}
}
