/**
 * 
 */
package com.eventplanner.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.yammer.metrics.annotation.Timed;

/**
 * @author arunmalik
 *
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RootResources {

	@GET
	public Response getStatus() {
		return Response.status(200).entity("Service Running successfully").build();
	}
}
