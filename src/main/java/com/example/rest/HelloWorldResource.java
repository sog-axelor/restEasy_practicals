
package com.example.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("hello")
public class HelloWorldResource {
	
	@Path("/helloGet")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
   public Response helloWorld() {
    	HelloWorld hw = new  HelloWorld();
    	hw.setId(101);
    	hw.setName("Test");
    	hw.setCity("Test");
    	return Response.ok(hw).build();
    }
	
	
	@Path("/helloPut")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
   public Response helloWorldPut() {
    	HelloWorld hw = new  HelloWorld();
    	hw.setId(101);
    	hw.setName("Test1");
    	hw.setCity("Test1");
    	return Response.ok(hw).build();
    }
	
	
	
	@Path("/helloDelete")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
   public Response helloWorldDelete() {
    	HelloWorld hw = new  HelloWorld();
    	hw.setId(101);
    	hw.setName("Test1");
    	hw.setCity("Test1");
    	return Response.ok(hw).build();
    }
}







