package com.dxc.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employ")
public class EmployRest {

	
	@POST
	  @Path("/employInsert/")
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public String insertEmploy(Employ e) {
	    String s = new EmployCrud().insertEmploy(e);
	    System.out.println(s);
	    return s;
	  }
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employ[] showAll() {
		Employ[] result = new EmployCrud().showEmploy();
		return result;
	}
	
	@GET
	@Path("/searchemploy/{empno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ searchEmploy(@PathParam("empno") int empno) {
		Employ result = new EmployCrud().searchEmploy(empno);
		return result;
	}
}
