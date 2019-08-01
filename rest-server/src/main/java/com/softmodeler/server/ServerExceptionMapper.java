/*******************************************************************************
 * $URL: $
 *
 * Copyright (c) 2019 SCODi Solutions AG, CH-6375 Beckenried
 *******************************************************************************/
package com.softmodeler.server;

import java.lang.reflect.UndeclaredThrowableException;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.cxf.jaxrs.utils.ExceptionUtils;

import com.softmodeler.common.communication.CommunicationUtil;

/**
 * @author created by Author: fdo, last update by $Author: $
 * @version $Revision: $, $Date: $
 */
public class ServerExceptionMapper implements ExceptionMapper<Throwable> {

	private boolean debug = true;
	
	@Override
	public Response toResponse(Throwable exception) {
		Response.Status status = Response.Status.INTERNAL_SERVER_ERROR;
		ResponseBuilder builder = Response.status(status);

		builder.header(CommunicationUtil.EXCEPTION_TYPE, exception.getClass().getName());
		builder.header(CommunicationUtil.EXCEPTION_MSG, exception.getMessage());
		if (debug ) {
			StringBuilder str = new StringBuilder();
			toString(exception, str);
			builder.header(CommunicationUtil.EXCEPTION_DETAIL, str.toString());	
		}

		return builder.build();
	}

	
	protected void toString(Throwable ex, StringBuilder str) {
		if (ex instanceof UndeclaredThrowableException) {
			toString(((UndeclaredThrowableException) ex).getUndeclaredThrowable(), str);
			return;
		}
		
		String stackTrace = ExceptionUtils.getStackTrace(ex);
		str.append(stackTrace);

		Throwable cause = ex.getCause();
		if (cause != null && cause != ex) {
			toString(cause, str);
		}
	}
}
