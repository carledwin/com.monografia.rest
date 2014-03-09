package com.monografia.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/status/methodGetStatus")
public class MethodGetStatus {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String retunInfo(){
		return"<p>Monografia RESTful em Java metodo GET do HTTP</p>";
	}
}
