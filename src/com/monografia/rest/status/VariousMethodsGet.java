package com.monografia.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/status/variousMethodsGet")
public class VariousMethodsGet {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnGet(){
		return "<p>Chamada ao metodo GET";
	}
	
	@GET
	@Path("/getVarious")
	@Produces(MediaType.TEXT_HTML)
	public String returnGetVarios(){
		return "<p>Chamada ao metodo GET com @Path";
	}
}
