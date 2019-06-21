package com.softmodeler.common.communication;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class CommunicationUtil {

	public static JacksonJaxbJsonProvider getProvider() {
		return new ExtendedEMFProvider();
//		return new SimpleEMFProvider();
	}
}
