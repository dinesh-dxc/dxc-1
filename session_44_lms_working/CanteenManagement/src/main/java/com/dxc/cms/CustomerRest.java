package com.dxc.cms;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerRest {

	@GET
	@Path("/validate/{user}/{passcode}")
	@Produces(MediaType.APPLICATION_JSON)
	public int validate(@PathParam("user") String user, @PathParam("passcode") String passcode) throws SQLException {
		CustomerDAO dao = new CustomerDAO();
		return dao.authenticate(user, passcode);
	}
}
