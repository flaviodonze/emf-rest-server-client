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

	/** singleton EMF provider instance */
	private static EMFJsonProvider provider = null;

	/**
	 * return the EMF provider singleton instance
	 *
	 * @return
	 */
	public static JacksonJsonProvider getJsonProvider() {
		if (provider == null) {
			provider = new EMFJsonProvider();
		}
		return provider;
	}

	/**
	 * return the providers for the remote service configuration
	 *
	 * @return
	 */
	public static List<Object> getProviders() {
		return Arrays.asList(getJsonProvider(), new ObjectMapperParamConverterProvider());
	}

	/**
	 * locate the json object mapper for the passed type
	 *
	 * @param clazz
	 * @return
	 */
	public static ObjectMapper locateMapper(Class<?> clazz) {
		return getJsonProvider().locateMapper(clazz, MediaType.APPLICATION_JSON_TYPE);
	}
}
