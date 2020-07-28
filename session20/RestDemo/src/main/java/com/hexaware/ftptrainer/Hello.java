package com.hexaware.ftptrainer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")  
public class Hello {

    @GET  
    @Produces(MediaType.APPLICATION_JSON)  
    public String sayHello() {  
        return "Welcome to Rest Webservices...";
    } 

    @GET  
    @Path("/sum/{i}/{j}")
    @Produces(MediaType.APPLICATION_JSON)  
    public String sum(@PathParam("i") int i,
    @PathParam("j") int j ) {  
        int c = i+j;
        String res = "Sum is  " +c;
        return res;
    } 
}