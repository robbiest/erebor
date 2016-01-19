package com.mkyong.rest;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserService {

	@GET
	@Path("/get")
	public Response addUser(@HeaderParam("user-agent") String userAgent) {

		return Response.status(200)
				.entity("addUser is called, userAgent : " + userAgent)
				.build();

	}
	/**
	@GET
	@Path("/getcontext")
	public Response addUser(@Context HttpHeaders headers) {

		String userAgent = headers.getRequestHeader("user-agent").get(0);
		
		return Response.status(200)
			.entity("addUser is called, userAgent : " + userAgent)
			.build();

	}
	*/
}