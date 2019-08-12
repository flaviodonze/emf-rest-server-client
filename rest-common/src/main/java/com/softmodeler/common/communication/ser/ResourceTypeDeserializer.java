package com.softmodeler.common.communication.ser;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.softmodeler.model.type.ResourceType;

public class ResourceTypeDeserializer extends JsonDeserializer<ResourceType> {

	@Override
	public ResourceType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ResourceType type = new ResourceType();
		JsonNode node = p.getCodec().readTree(p);
		String path = node.get("path").asText();
		if (path != null) {
			type.setPath(path);
			byte[] binaryValue = node.get("inputstream").binaryValue();
			if (binaryValue != null) {
				type.setInputStream(new ByteArrayInputStream(binaryValue));
			}
		}
		return type;
	}
}
