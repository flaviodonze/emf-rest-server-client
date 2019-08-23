package com.softmodeler.common.communication.ser;

import org.eclipse.emf.ecore.EObject;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.softmodeler.model.type.ResourceType;

public class EMFSerializers extends Serializers.Base {

	@Override
	public JsonSerializer<?> findSerializer(SerializationConfig config, JavaType type, BeanDescription beanDesc) {
		if (type.isTypeOrSubTypeOf(ResourceType.class)) {
			return new ResourceTypeSerializer();
		}
		if (type.isTypeOrSubTypeOf(EObject.class)) {
			return new EObjectSerializer();
		}
		return super.findSerializer(config, type, beanDesc);
	}

}
