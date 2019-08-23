package com.softmodeler.common.communication.ser;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.softmodeler.model.type.ResourceType;

public class ResourceTypeDeserializer extends JsonDeserializer<ResourceType> {

	@Override
	public Object deserializeWithType(JsonParser p, DeserializationContext ctxt, TypeDeserializer typeDeserializer) throws IOException {
		return typeDeserializer.deserializeTypedFromArray(p, ctxt);
	}

	@Override
	public ResourceType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ResourceType type = new ResourceType();

		while (p.nextToken() != JsonToken.END_OBJECT) {
			String fieldName = p.currentName();
			p.nextToken();
			if ("path".equals(fieldName)) {
				type.setPath(p.getValueAsString());
			}
			if ("inputstream".equals(fieldName)) {
				byte[] binaryValue = p.getBinaryValue();
				if (binaryValue != null) {
					type.setInputStream(new ByteArrayInputStream(binaryValue));
				}
			}
		}

		return type;
	}
}
