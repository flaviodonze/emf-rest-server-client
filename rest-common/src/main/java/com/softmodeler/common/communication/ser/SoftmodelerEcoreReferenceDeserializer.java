package com.softmodeler.common.communication.ser;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.emfjson.jackson.databind.EMFContext;
import org.emfjson.jackson.databind.deser.ReferenceEntry;
import org.emfjson.jackson.utils.EObjects;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class SoftmodelerEcoreReferenceDeserializer extends JsonDeserializer<ReferenceEntry> {

	@Override
	public ReferenceEntry deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
		EObject parent = EMFContext.getParent(ctxt);
		EReference reference = EMFContext.getReference(ctxt);

		JavaType type = TypeFactory.defaultInstance().constructType(reference.getEReferenceType().getInstanceClass());
		JsonDeserializer<Object> deserializer = ctxt.findRootValueDeserializer(type);
		EObject object = (EObject) deserializer.deserialize(jp, ctxt);

		EObjects.setOrAdd(parent, reference, object);

//		return new ReferenceEntry.Base(parent, reference, EcoreUtil.getID(object));
		
		// return null since already resolved and added
		return null;
	}
}