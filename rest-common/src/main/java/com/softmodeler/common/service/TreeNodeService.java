package com.softmodeler.common.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.softmodeler.model.TreeNode;
import com.softmodeler.model.TreeNodeChild;

@Path("/TreeNodeService")
public interface TreeNodeService extends BasicService {

	@GET
	@Path("/getNode")
	TreeNode getNode();

	@GET
	@Path("/getChild")
	TreeNodeChild getChild();

	@POST
	@Path("/set")
	void set(TreeNode object);
}
