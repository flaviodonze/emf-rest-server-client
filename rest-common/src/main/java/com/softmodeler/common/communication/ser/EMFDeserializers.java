package com.softmodeler.common.communication.ser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.softmodeler.model.type.ResourceType;

public class EMFDeserializers extends Deserializers.Base {

	@Override
	public JsonDeserializer<?> findEnumDeserializer(Class<?> type, DeserializationConfig config, BeanDescription beanDesc)
			throws JsonMappingException {
		if (Enumerator.class.isAssignableFrom(type)) {
			EDataType dataType = (EDataType) EcoreJsonUtil.getClassifier(type.getSimpleName());
			if (dataType != null) {
				return new EDataTypeDeserializer(dataType);
			}
		}
		return super.findEnumDeserializer(type, config, beanDesc);
	}

	@Override
	public JsonDeserializer<?> findBeanDeserializer(JavaType type, DeserializationConfig config, BeanDescription beanDesc)
			throws JsonMappingException {
		if (type.isTypeOrSubTypeOf(ResourceType.class)) {
			return new ResourceTypeDeserializer();
		}
		if (type.isTypeOrSubTypeOf(EObject.class)) {
			return new EObjectDeserializer(type);
		}
		return super.findBeanDeserializer(type, config, beanDesc);
	}
}
