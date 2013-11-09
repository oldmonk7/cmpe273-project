package com.eventplanner.api.resources;

import java.util.List;

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

@Path("/signup")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LoginResource {

    public LoginResource() {
    }
    
    
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

    @POST
    @Path("/serviceprovider")
	@Timed(name = "create-stakeholders")
    public Response saveStakeHolders(@Valid StakeHolders stakeHolderToCreate) {
		try{
			return Response.status(200).entity("StakeHolderCreated").build();
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
    
    @POST
    @Path("/customer")
	@Timed(name = "create-user")
    public Response saveUser(@Valid Users userToCreate) {
		try{
			userToCreate.saveUser();
			return Response.status(201).entity("CustomerCreated").build();
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
    
    @GET
    @Path("/customer")
	@Timed(name = "create-user")
    public Response getUsers() {
		try{
			Users obj = new Users();
			//Iterable<Users> user = obj.getUsers();
			
			
			return Response.status(200).entity(obj.findUsers("{name: \"Arun\"}")).build();
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

