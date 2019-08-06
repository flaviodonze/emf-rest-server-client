package com.softmodeler.common.communication.ser;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.softmodeler.model.type.ResourceType;

public class ResourceTypeSerializer extends JsonSerializer<ResourceType> {
	
	@Override
	public void serialize(ResourceType value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		if (value == null || value.getPath() == null) {
			gen.writeNull();
			return;
		}
		gen.writeStartObject();
		gen.writeFieldName("path");
		gen.writeString(value.getPath());
		gen.writeFieldName("inputstream");

		File file = value.getFile();
		if (file != null) {
			try (InputStream inputStream = new FileInputStream(file)) {
				gen.writeBinary(inputStream, -1);
			}
		} else {
			InputStream inputStream = value.getInputStream();
			if (inputStream == null) {
				gen.writeNull();
			} else {
				if (inputStream instanceof ByteArrayInputStream) {
					gen.writeBinary(inputStream, -1);
				} else {
					throw new IOException("ResourceType can only have a ByteArrayInputStream set to send to the server"); //$NON-NLS-1$
				}
			}
		}
		gen.writeEndObject();
	}

}
