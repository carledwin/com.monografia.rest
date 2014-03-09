package com.monografia.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/status/methodPostforGetStatus")
public class MethodPostforGetStatus {
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String returnInfPost(){
		return"<p>Monografia RESTful em Java metodo errado @POST do HTTP</p>";
	}
	

}
