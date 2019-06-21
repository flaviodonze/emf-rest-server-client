package com.softmodeler.common.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.softmodeler.model.Attachment;
import com.softmodeler.model.Code;
import com.softmodeler.model.NotificationDefinition;

@Path("/NotificationDefinitionService")
public interface NotificationDefinitionService extends BasicService {

	@GET
	@Path("/getCode")
	Code getCode();

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
