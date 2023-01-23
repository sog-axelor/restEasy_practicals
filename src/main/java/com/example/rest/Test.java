package com.example.rest;

import java.io.IOException;
import java.lang.annotation.Target;
import java.rmi.ServerException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class Test {

	
//	@Path("/helloGet")				//1.
//	@GET	
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response  helloGet()
//	{
//		Student st = new  Student();
//		st.setId(101);
//		st.setName("Test");
//		st.setCity("Test");
//		return Response.ok(st).build();
//	}
//	
	
//	@Path("/helloPost")				//2.
//	@POST	
//	@Produces(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_JSON)
//	public Response  helloPost()
//	{
//		Student st = new  Student();
//		st.setId(102);
//		st.setName("Test_Post");
//		st.setCity("Test_Post");
//		return Response.ok(st).build();
//	}
	
	
//	@POST
//	@Path("/add")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response addStudent(
//			int id,String name,String city) {
//		 id = 5;
//		 name = "Test";
//		 city = "Test";
//		
//		return Response.status(200).entity("Student id is : " + id +"Name : " + name + "City : " + city).build();
//		
//	}
	
//    @GET  
//    @Path("/{param}")  
//    public Response getMsg(@PathParam("param") String msg) {  
//        String output = "Get Method  Say : " + msg;  
//        return Response.status(200).entity(output).build();  
//    }  
//    
//    @POST	  
//    @Path("/create")  
//    public void create(@FormParam("id") int id,@FormParam("fname") String fname,@FormParam("lname") String lname ,
//    		@Context HttpServletRequest req,@Context HttpServletResponse res)
//    	throws ServerException,IOException{
//    	
//    	Student stud = new Student(id, fname, lname);
//    	
//    }
	
	
	    @POST	  			//working as post Method
	    @Path("/create")  
	    public Response create(@FormParam("id") int id,@FormParam("fname") String fname,@FormParam("lname") String lname){

		    return Response.status(200)  
		            .entity("Student added successfuly!<br> Id: "+ id+"<br> First name: " + fname+"<br> Last Name: "+lname)  
		            .build();
	    }
	   
	@Path("/helloGet/")				//1.
	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public Response  helloGet()
	{
	
	  List<Student> students = new ArrayList<>();
	   
		  students.add(new Student(101,"Seth","ManikChand")); 
		  students.add(new Student(102,"Seth","DharamRaj"));
		  students.add(new Student(103,"Seth","Lala"));
		  	
		  return Response.ok(students).build();
		  
	}	  
	
	
	
	  @PUT
	  @Path("/{id}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Response updatestudent(@PathParam("id") int id)
	  {
		  Student student = new Student(id, "Jane","Doe");
		return Response.status(200).entity(student).build();		  
	  }
	  
	  
//	  @PUT
//	  @Path("{id}")
//	  public Response updateStudent(@PathParam("id") int id) {
//	      Student student = new Student(id, "Jane","Doe");
//	      return Response.status(200).entity(student).build();
//	  }

	  
//
//	    @Path("/{id}")
//	    @DELETE
//	    @Produces(MediaType.APPLICATION_JSON)
//	    public Response deleteUser(@PathParam("id") int id) {
//	        boolean result = Student.delete(id);
//
//	        if (result) {
//	            return Response.ok().status(Response.Status.NO_CONTENT).build();
//	        } else {
//	            return Response.notModified().build();
//	        }
//	    }
//	  
	   

}

































