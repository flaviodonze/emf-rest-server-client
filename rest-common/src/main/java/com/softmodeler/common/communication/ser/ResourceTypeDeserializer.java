package com.softmodeler.common.communication.ser;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.softmodeler.model.type.ResourceType;

public class ResourceTypeDeserializer extends JsonDeserializer<ResourceType> {

	@Override
	public ResourceType deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		if (p.currentToken() == JsonToken.START_OBJECT) {
			ResourceType type = new ResourceType();
			
			p.nextFieldName();
			String path = p.nextTextValue();
			type.setPath(path);

			p.nextFieldName();
			JsonToken token = p.nextValue();
			if (JsonToken.VALUE_NULL != token) {
				type.setInputStream(new ByteArrayInputStream(p.getBinaryValue()));
//				File file = F;
//				FileOutputStream out = new FileOutputStream(file);
//				p.readBinaryValue(out);
//				out.close();
//				type.setFile(file);
			}
			return type;
		}
		return null;
	}

}
