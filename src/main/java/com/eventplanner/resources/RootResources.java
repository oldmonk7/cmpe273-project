/**
 * 
 */
package com.eventplanner.resources;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.eventplanner.domain.StakeHolders;
import com.eventplanner.domain.Users;
import com.yammer.metrics.annotation.Timed;

/**
 * @author arunmalik
 *
 */
@Path("/index")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RootResources {

//	public RootResources() {
//		
//	}
	
	@GET
	@Timed(name = "view-stakeholders")
	 public Response getStakeHolders() {
		try{
			//StakeHolders.getStakeHolders();
			
			
			return Response.status(200).entity("CustomerCreated").build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(null != null)
			{
				//null = null;
			}
		}
    }
}
