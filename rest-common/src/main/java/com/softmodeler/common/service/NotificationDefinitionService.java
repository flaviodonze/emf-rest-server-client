package com.softmodeler.common.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.softmodeler.model.Attachment;
import com.softmodeler.model.Code;
import com.softmodeler.model.NotificationDefinition;
import com.softmodeler.model.ObjectRef;
import com.softmodeler.model.ObjectState;

@Path("/NotificationDefinitionService")
public interface NotificationDefinitionService extends BasicService {

	/**
	 * test enum
	 * 
	 * @param id
	 * @return
	 */
	@GET
	@Path("/getState")
	ObjectState getState(String id);
	
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
	@Path("/createNotificationDefinition")
	NotificationDefinition createNotificationDefinition(@QueryParam("suffix") String suffix);

	@POST
	@Path("/setNotificationDefinition")
	void setNotificationDefinition(NotificationDefinition object);

	@GET
	@Path("/getResource")
	Attachment getResource();

	@POST
	@Path("/setResource")
	void setResource(Attachment attachment);
	
	@GET
	@Path("/getObjectSet")
	Set<ObjectRef> getObjectSet();

	@GET
	@Path("/testListGet")
	List<NotificationDefinition> testListGet(@QueryParam("objects") List<NotificationDefinition> objects);
	
	@POST
	@Path("/testListPost")
	List<NotificationDefinition> testListPost(List<NotificationDefinition> objects);

	@GET
	@Path("/testSetGet")
	Set<NotificationDefinition> testSetGet(@QueryParam("objects") Set<NotificationDefinition> objects);

	@POST
	@Path("/testSetPost")
	Set<NotificationDefinition> testSetPost(Set<NotificationDefinition> objects);
	
	@GET
	@Path("/testMapGet")
	Map<String, NotificationDefinition> testMapGet(@QueryParam("objects") Map<String, NotificationDefinition> objects);

	@POST
	@Path("/testMapPost")
	Map<String, NotificationDefinition> testMapPost(Map<String, NotificationDefinition> objects);
	

}
