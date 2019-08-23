package com.softmodeler.common.communication.ser;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class EObjectDeserializer extends JsonDeserializer<EObject> {

	private JavaType type;

	public EObjectDeserializer(JavaType type) {
		this.type = type;
	}

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException {
		return typeDeserializer.deserializeTypedFromAny(p, ctxt);
	}

	@Override
	public EObject deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		String classifierName = type.getTypeName();
		EClass classifier = EcoreJsonUtil
				.getEClass(classifierName.substring(classifierName.lastIndexOf(".") + 1, classifierName.length() - 1));
		EObject object = EcoreUtil.create(classifier);

		// code from BeanDeserializer.deserialize()
		String propName;
		if (p.isExpectedStartObjectToken()) {
			propName = p.nextFieldName();
			if (propName == null) {
				return object;
			}
		} else {
			if (p.hasTokenId(JsonTokenId.ID_FIELD_NAME)) {
				propName = p.getCurrentName();
			} else {
				return object;
			}
		}

		do {
			p.nextToken();

			EStructuralFeature feature = classifier.getEStructuralFeature(propName);
			feature.getEType();

			// TODO cache deserializer for feature
			JavaType contentType = constructType(ctxt, feature);
			JsonDeserializer<Object> deser = ctxt.findRootValueDeserializer(contentType);
			Object value = deser.deserialize(p, ctxt);

			// value should not be null after deserialization, rather not serialize at all
			if (value == null) {
				// throw new RuntimeException("deserialization returned null: " + feature);
			}
			object.eSet(feature, value);

			continue;
		} while ((propName = p.nextFieldName()) != null);
		return object;
	}

	private JavaType constructType(DeserializationContext ctxt, EStructuralFeature feature) {
		Class<?> instanceClass = feature.getEType().getInstanceClass();
		if (instanceClass == null) {
			// fallback, force EObjectDeserializer
			instanceClass = EObject.class;
		}

		TypeFactory typeFactory = ctxt.getTypeFactory();
		if (Map.Entry.class.isAssignableFrom(instanceClass)) {
			JavaType stringType = typeFactory.constructSimpleType(String.class, null);
			JavaType map = typeFactory.constructSimpleType(instanceClass, new JavaType[] { stringType, stringType });
			return typeFactory.constructCollectionType(List.class, map);
		}
		return feature.isMany() ? typeFactory.constructCollectionType(List.class, instanceClass)
				: typeFactory.constructSimpleType(instanceClass, null);
	}
}
