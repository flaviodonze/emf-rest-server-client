/*******************************************************************************
 * $URL: $
 *
 * Copyright (c) 2019 Qualisys GmbH, CH-4106 Therwil
 *******************************************************************************/
package com.softmodeler.client;

import java.lang.reflect.Constructor;

import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

import com.softmodeler.common.ValidationException;
import com.softmodeler.common.communication.CommunicationUtil;

/**
 * @author created by Author: fdo, last update by $Author: $
 * @version $Revision: $, $Date: $
 */
public class ClientExceptionMapper implements ResponseExceptionMapper<Throwable> {

	@Override
	public Throwable toThrowable(Response response) {
		String msg = response.getHeaderString(CommunicationUtil.EXCEPTION_MSG);
		String type = response.getHeaderString(CommunicationUtil.EXCEPTION_TYPE);
		if (type != null && ValidationException.class.getName().equals(type)) {
			return new ValidationException(msg);
		}
		try {
			if (type != null) {
				Class<?> clazz = getClass().getClassLoader().loadClass(type);
				if (msg != null && !msg.isEmpty()) {
					Constructor<?> constructor = clazz.getConstructor(String.class);
					return (Throwable) constructor.newInstance(msg);
				}
				return (Throwable) clazz.newInstance();
			}
		} catch (Exception e) {
			// ignore exception, will use fallback
		}
		return new Exception(msg);
	}

}
