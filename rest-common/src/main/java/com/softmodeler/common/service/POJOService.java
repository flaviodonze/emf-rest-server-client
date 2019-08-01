package com.softmodeler.common.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.softmodeler.common.ServerException;
import com.softmodeler.common.ValidationException;
import com.softmodeler.common.pojo.SampleObject;

@Path("/POJOService")
public interface POJOService extends BasicService {

	@GET
	@Path("/get")
	SampleObject get();

	@POST
	@Path("/set")
	void set(SampleObject object);

	@GET
	@Path("/all")
	List<SampleObject> findAll();
	
	@GET
	@Path("/getSampleSet")
	Set<SampleObject> getSampleSet();
	
	@GET
	@Path("/getSampleMap")
	Map<String, SampleObject> getSampleMap();

	@GET
	@Path("/testException")
	void testException() throws Exception;

	@GET
	@Path("/testRuntimeException")
	void testRuntimeException();
	
	@GET
	@Path("/testServerException")
	void testServerException() throws ServerException;
	
	@GET
	@Path("/testValidationException")
	void testValidationException() throws ValidationException;
}
