
package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
   public Response helloWorld() {
    	HelloWorld hw = new  HelloWorld();
    	hw.setMessage("Hello World!!!");
    	return Response.ok(hw).build();
    }
}
