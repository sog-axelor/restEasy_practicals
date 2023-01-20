package com.example.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class Test {
		
	@Path("/helloGet")				//1.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String  helloGet(@PathParam("Value") String Value)
	{
		System.out.println("Hello WOrld" + Value);
		return " Hello World " + Value;
	}
		
	
	@Path("/helloPost")				//2.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response  helloPost(Student student)
	{
		Student st = new  Student();
		st.setId(101);
		st.setName("Test");
		st.setCity("Test");
		return Response.ok(st).build();
		//return student;
	}
}

































