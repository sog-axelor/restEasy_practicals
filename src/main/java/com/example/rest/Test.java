package com.example.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Test {
	
	
//	@Path("/hello/{Value}")				//@Pathparam
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	//@Consumes(MediaType.APPLICATION_JSON)
//	public String  hello(@PathParam("Value") String Value)
//	{
//		System.out.println("Hello WOrld" + Value);
//		return "Hello World " + Value;
//	}
	
	
	
//	@Path("/hello")				//2.@QueryParam
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String  hello(@QueryParam("Value") String Value)
//	{
//		System.out.println("Hello WOrld" + Value);
//		return "Hello World " + Value;
//	}
//	
	
//	@Path("/hello")				//3.@MatrixParam
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String  hello(@MatrixParam("Value") String Value)
//	{
//		System.out.println("Hello WOrld" + Value);
//		return " Hello World " + Value;
//	}
	
	
//	@Path("/hello")				//3.@HeaderParam
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String  hello(@HeaderParam("Value") String Value)
//	{
//		System.out.println("Hello WOrld" + Value);
//		return " Hello World " + Value;
//	}
	
//	@Path("/hello")				//3.@FormPAram
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public String  hello(@FormParam("Value") String Value)
//	{
//		Value = "Test";
//		System.out.println("Hello WOrld" + Value);
//		return " Hello World " + Value;
//	}
}












