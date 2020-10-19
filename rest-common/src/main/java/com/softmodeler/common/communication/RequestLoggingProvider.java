package com.softmodeler.common.communication;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;

public class RequestLoggingProvider implements ClientRequestFilter, ClientResponseFilter  {
	/** request/response logger */
//	private final Logger logger = LoggerFactory.getLogger(RequestLoggingProvider.class);
	
	@Override
	public void filter(ClientRequestContext request, ClientResponseContext resonse) throws IOException {
		URI uri = request.getUri();
//
//		logger.info(">> request uri: {}", uri);
		
//		System.out.println(">> response uri : "+uri);
	}

	@Override
	public void filter(ClientRequestContext request) throws IOException {
		URI uri = request.getUri();
		
		System.out.println(">> request uri "+request.getMethod()+": "+uri+" -- "+request.getEntity());
//		logger.info(">> request uri {}: {} -- {}", request.getMethod() , uri, request.getEntity());
	}

	
}
