package com.eventplanner.api.resources;

import com.eventplanner.domain.Users;
import com.google.common.collect.Lists;
import com.yammer.metrics.annotation.Timed;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

	@POST
	@Timed(name = "create-user")
	public Response saveUser(@Valid Users userToCreate) {

		try{
			userToCreate.setType("customer");
			userToCreate.addUserToken();
			userToCreate.saveUser();
			return Response.status(201).entity(userToCreate.toResponseList()).build();
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
	public Response getUsers(@HeaderParam("Auth-Token") String token) {
		Iterable<Users> user  =null;
		Users userObj = new Users();
		if(userObj.isUserTokenValid(token))
		{
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
		else
		{
			return Response.status(Response.Status.UNAUTHORIZED).entity("Unauthorized access").build();
		}
	}

	@GET
	@Path("/{name}")
	@Timed(name = "get-user")
	public Response getUser(@PathParam("name") String name,@HeaderParam("Auth-Token") String token) {
		Users userObj = new Users();
		if(userObj.isUserTokenValid(token))
		{
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
		else
		{
			return Response.status(Response.Status.UNAUTHORIZED).entity("Unauthorized access").build();
		}

	}
}
