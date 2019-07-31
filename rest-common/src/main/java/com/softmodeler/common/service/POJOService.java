package com.softmodeler.common.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

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
}
