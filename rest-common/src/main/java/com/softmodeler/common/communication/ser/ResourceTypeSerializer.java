package com.softmodeler.common.communication.ser;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.softmodeler.model.type.ResourceType;

public class ResourceTypeSerializer extends JsonSerializer<ResourceType> {

	@Override
	public void serializeWithType(ResourceType value, JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer)
			throws IOException {
		WritableTypeId typeIdDef = typeSer.writeTypePrefix(gen, typeSer.typeId(value, JsonToken.START_OBJECT));
		serialize(value, gen, serializers);
		typeSer.writeTypeSuffix(gen, typeIdDef);
	}

	@Override
	public void serialize(ResourceType value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		String path = value.getPath();
		serializers.defaultSerializeField("path", path, gen);

		InputStream inputStream = value.getInputStream();
		if (inputStream == null) {
			File file = value.getFile();
			if (file != null) {
				inputStream = new FileInputStream(file);
			}
		}
		if (inputStream != null) {
			if (inputStream instanceof ByteArrayInputStream || inputStream instanceof FileInputStream) {
				gen.writeFieldName("inputstream");
				gen.writeBinary(inputStream, -1);
			} else {
				throw new IOException("ResourceType can only have a ByteArrayInputStream/FileInputStream set to send to the server"); //$NON-NLS-1$
			}
		}
	}

}
