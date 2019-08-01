package com.softmodeler.common.communication;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class CommunicationUtil {

	/** 'exceptionType' response header key */
	public static final String EXCEPTION_TYPE = "exceptionType";
	/** 'exceptionMsg' response header key */
	public static final String EXCEPTION_MSG = "exceptionMsg";
	/** 'exceptionDetail' response header key */
	public static final String EXCEPTION_DETAIL = "exceptionDetail";
	
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
	
	public static ObjectMapper locateMapper(Class<?> clazz) {
		return getEMFProvider().locateMapper(clazz, MediaType.APPLICATION_JSON_TYPE);
	}
}
