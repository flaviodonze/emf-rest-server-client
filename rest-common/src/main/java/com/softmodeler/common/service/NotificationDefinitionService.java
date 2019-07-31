package com.softmodeler.common.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.softmodeler.model.Attachment;
import com.softmodeler.model.Code;
import com.softmodeler.model.NotificationDefinition;

@Path("/NotificationDefinitionService")
public interface NotificationDefinitionService extends BasicService {

	/**
	 * test return of simple EMF object
	 * 
	 * @return
	 */
	@GET
	@Path("/getCode")
	Code getCode();

	/**
	 * test of using EMF object as parameter
	 * 
	 * @param code
	 * @return
	 */
	@GET
	@Path("/findByCode")
	NotificationDefinition findByCode(@QueryParam("code") Code code);
	
	@GET
	@Path("/getNotificationDefinition")
	NotificationDefinition getNotificationDefinition();

	@POST
	@Path("/setNotificationDefinition")
	void setNotificationDefinition(NotificationDefinition object);

	@GET
	@Path("/getResource")
	Attachment getResource();

	@POST
	@Path("/setResource")
	void setResource(Attachment attachment);
}
