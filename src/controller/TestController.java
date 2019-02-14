package controller;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.JsonObject;


@Path("/test")
public class TestController {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String test() { 
		JsonObject obj = new JsonObject();
		obj.addProperty("name", "test");		
		return obj.toString();
	}

}
