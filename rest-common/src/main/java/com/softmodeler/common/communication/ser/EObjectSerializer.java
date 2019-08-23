package com.softmodeler.common.communication.ser;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class EObjectSerializer extends JsonSerializer<EObject> {

	@Override
	public void serializeWithType(EObject value, JsonGenerator gen, SerializerProvider provider, TypeSerializer typeSer)
			throws IOException {
		WritableTypeId typeIdDef = typeSer.writeTypePrefix(gen, typeSer.typeId(value, JsonToken.START_OBJECT));
		serialize(value, gen, provider);
		typeSer.writeTypeSuffix(gen, typeIdDef);
	}

	@Override
	public Class<EObject> handledType() {
		return EObject.class;
	}

	@Override
	public void serialize(EObject object, JsonGenerator gen, SerializerProvider provider) throws IOException {
		if (object != null) {
			EClass classifier = object.eClass();

			List<EStructuralFeature> fields = classifier.getEAllStructuralFeatures();
			for (EStructuralFeature feature : fields) {
				if (object.eIsSet(feature) && !feature.isTransient()) {
					if (feature instanceof EReference) {
						EReference reference = (EReference) feature;
						if (reference.getEOpposite() != null && reference.isContainer()) {
							// skip, otherwise will create loop
							continue;
						}
					}

					// TODO maybe cache serializer for field
					Object value = object.eGet(feature);

					// hack for EMap, use plain map serialization
					if (value instanceof EMap) {
						value = new HashMap<>(((EMap<?, ?>) value).map());
					}

					provider.defaultSerializeField(feature.getName(), value, gen);
				}
			}
		}

	}

}
