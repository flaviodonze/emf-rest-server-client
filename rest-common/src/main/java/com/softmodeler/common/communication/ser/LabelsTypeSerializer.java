package com.softmodeler.common.communication.ser;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.softmodeler.model.type.LabelsType;

public class LabelsTypeSerializer extends JsonSerializer<LabelsType> {

	@Override
	public void serialize(LabelsType value, JsonGenerator gen, SerializerProvider serializers)
			throws IOException {
//        if (value == null || value.isEmpty()) {
//        	gen.writeNull();
//        	return;
//        }
        
		gen.writeObject(value.toString());
	}
	
	@Override
	public boolean isEmpty(SerializerProvider provider, LabelsType value) {
       return (value == null || value.isEmpty());
	}
	
}
