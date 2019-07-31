package com.softmodeler.common.communication;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class CommunicationUtil {

	private static ExtendedEMFProvider provider = null;
	
	public static JacksonJaxbJsonProvider getEMFProvider() {
		if (provider==null) {
			provider = new ExtendedEMFProvider();
//			provider = new SimpleEMFProvider();
		}
		return provider;
	}
	
	public static List<Object> getProviders() {
		return Arrays.asList(getEMFProvider(), new JacksonJsonParamConverterProvider());
	}
}
