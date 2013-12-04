package com.eventplanner.api.resources;

import com.eventplanner.domain.StakeHolders;
import com.eventplanner.domain.Users;
import com.yammer.metrics.annotation.Timed;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
			
			
			return Response.status(200).entity("{msg : CustomerCreated}").build();
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
             String msg="{\"msg\":\"StakeHolder Created\"}";
			return Response.status(201).entity(msg).build();
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
            String msg = "{\"msg\":\"Customer Created\"}";
            System.out.println((Response.status(201).entity(msg).build().getEntity()));


			return Response.status(201).entity(msg).build();
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

