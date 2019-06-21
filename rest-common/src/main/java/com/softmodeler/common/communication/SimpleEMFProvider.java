package com.softmodeler.common.communication;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.emfjson.jackson.module.EMFModule;
import org.emfjson.jackson.resource.JsonResourceFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.softmodeler.common.communication.ser.LabelsTypeSerializer;
import com.softmodeler.common.communication.ser.ResourceTypeDeserializer;
import com.softmodeler.common.communication.ser.ResourceTypeSerializer;
import com.softmodeler.model.SoftmodelerPackage;
import com.softmodeler.model.type.LabelsType;
import com.softmodeler.model.type.ResourceType;

public class SimpleEMFProvider extends JacksonJaxbJsonProvider {

	public SimpleEMFProvider() {
		super();
		
		setMapper(setupFactory().getMapper());
	}

	private JsonResourceFactory setupFactory() {
		final ObjectMapper mapper = new ObjectMapper();
		// same as emf
		final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
		dateFormat.setTimeZone(TimeZone.getDefault());

		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.setDateFormat(dateFormat);
		mapper.setTimeZone(TimeZone.getDefault());

		EMFModule module = new EMFModule();
		
		// add custom serializers/deserializers
		module.addSerializer(ResourceType.class, new ResourceTypeSerializer());
		module.addDeserializer(ResourceType.class, new ResourceTypeDeserializer());
		module.addSerializer(LabelsType.class, new LabelsTypeSerializer());

		mapper.registerModule(module);

		JsonResourceFactory factory = new JsonResourceFactory(mapper);
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(SoftmodelerPackage.eNS_URI, SoftmodelerPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", factory);
		return factory;
	}
}
