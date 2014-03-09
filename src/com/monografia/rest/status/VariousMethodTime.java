package com.monografia.rest.status;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/time")
public class VariousMethodTime {

	private String time = new SimpleDateFormat("HH:mm").format(new Date());
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTime(){
		return "Hora atual da aplicacao: " + time + " via metodo @GET do HTTP-REST";
	}
	
}
