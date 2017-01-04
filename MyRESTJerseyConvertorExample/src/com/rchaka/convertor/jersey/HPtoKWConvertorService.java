package com.rchaka.convertor.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Implements service for convert horse power to the kw 1.35*kw=hp
 * 
 * @author Roman Korchaka
 *
 */

@Path("/hptokwservice")
public class HPtoKWConvertorService {

	@GET
	@Produces("application/json")
	public Response convertHpToKw() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double koef = 1.36;
		Double horsePower = 225.0;
		Double kWat;
		kWat = horsePower / koef;
		jsonObject.put("Horse power Value", horsePower);
		jsonObject.put("Kilo Watt Value", kWat);

		String result = "@Produces(\"application/json\") Output: \n\nHorse power to KWat Converter Output: \n\n"
				+ jsonObject;
		return Response.status(200).entity(result).build();
	}

	@Path("{hp}")
	@GET
	@Produces("application/json")
	public Response convertHPtoKWwithParam(@PathParam("hp") float horsePower) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double koef = 1.36;
		Double kWat;
		kWat = horsePower / koef;
		jsonObject.put("Horse power Value", horsePower);
		jsonObject.put("Kilo Watt Value", kWat);

		String result = "@Produces(\"application/json\") Output: \n\nHorse power to KWatt Converter Output: \n\n"
				+ jsonObject;
		return Response.status(200).entity(result).build();
	}

}
