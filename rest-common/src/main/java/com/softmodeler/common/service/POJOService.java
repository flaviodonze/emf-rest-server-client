package com.softmodeler.common.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.softmodeler.common.pojo.SampleObject;

@Path("/POJOService")
public interface POJOService extends BasicService {

	@GET
	@Path("/get")
	public SampleObject get();

	@POST
	@Path("/set")
	public void set(SampleObject object);

	@GET
	@Path("/all")
	public List<SampleObject> findAll();
}
