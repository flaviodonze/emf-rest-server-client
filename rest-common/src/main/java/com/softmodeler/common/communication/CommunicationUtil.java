package com.softmodeler.common.communication;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class CommunicationUtil {

	/** 'exceptionType' response header key */
	public static final String EXCEPTION_TYPE = "exceptionType";
	/** 'exceptionMsg' response header key */
	public static final String EXCEPTION_MSG = "exceptionMsg";
	/** 'exceptionDetail' response header key */
	public static final String EXCEPTION_DETAIL = "exceptionDetail";
	
	private static ExtendedEMFProvider provider = null;
	
	public static JacksonJsonProvider getEMFProvider() {
		if (provider==null) {
			provider = new ExtendedEMFProvider();
		}
		return provider;
	}
	
	public static List<Object> getProviders() {
		return Arrays.asList(getEMFProvider(), new ObjectMapperParamConverterProvider());
	}
	
	public static ObjectMapper locateMapper(Class<?> clazz) {
		return getEMFProvider().locateMapper(clazz, MediaType.APPLICATION_JSON_TYPE);
	}
}
