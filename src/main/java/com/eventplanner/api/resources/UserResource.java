package com.eventplanner.api.resources;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.eventplanner.domain.Users;
import com.google.common.collect.Lists;
import com.yammer.metrics.annotation.Timed;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

	@POST
	@Timed(name = "create-user")
    public Response saveUser(@Valid Users userToCreate) {
		try{
			userToCreate.saveUser();
			return Response.status(201).entity("User Created : \n"+ userToCreate.toList()).build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(userToCreate != null)
			{
				userToCreate= null;
			}
		}
    }
    
    @GET
	@Timed(name = "get-user")
    public Response getUsers() {
    	Iterable<Users> user  =null;
    	Users userObj = new Users();
		try{
			user = userObj.getUsers();			
			return Response.status(200).entity(Lists.newArrayList(user)).build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(user != null)
			{
				user = null;
			}
			if(userObj != null)
			{
				userObj = null;
			}
		}
    }
    
    @GET
    @Path("/{name}")
	@Timed(name = "get-user")
    public Response getUser(@PathParam("name") String name) {
    	Users userObj = new Users();
		try{
			
			return Response.status(200).entity( userObj.findUserByName(name)).build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(userObj != null)
			{
				userObj = null;
			}
		}
    }
}
