package com.eventplanner.api.resources;

import com.eventplanner.domain.StakeHolders;
import com.eventplanner.domain.Users;
import com.google.common.collect.Lists;
import com.yammer.metrics.annotation.Timed;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/stakeholders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StakeHolderResource {

	@POST
	@Timed(name = "create-stakeholder")
	public Response saveUser(@Valid StakeHolders stakeHolderToCreate) {

		try{
			stakeHolderToCreate.getUser().setType("stakeHolder");
			stakeHolderToCreate.getUser().addUserToken();
			Users obj = stakeHolderToCreate.getUser();
			obj.saveUser();
			stakeHolderToCreate.saveStakeHolder();
			//String msg="{\"msg\":\"StakeHolder Created\"}";
			return Response.status(201).entity("StakeHolder Created : \n"+ stakeHolderToCreate.toResponseList()).build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(stakeHolderToCreate != null)
			{
				stakeHolderToCreate= null;
			}
		}
	}


	@GET
	@Timed(name = "get-stakeHolders")
	public Response getUsers(@HeaderParam("Auth-Token") String token) {
		Iterable<StakeHolders> stakeHolders  =null;
		StakeHolders stakeObj = new StakeHolders();
		if(stakeObj.getUser().isUserTokenValid(token))
		{
			try{
				stakeHolders = stakeObj.getStakeHolders();			
				return Response.status(200).entity(Lists.newArrayList(stakeHolders)).build();
			}
			catch(Exception ex)
			{
				return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
			}
			finally
			{
				if(stakeObj != null)
				{
					stakeObj = null;
				}
				if(stakeHolders != null)
				{
					stakeHolders = null;
				}
			}
		}
		else
		{
			return Response.status(Response.Status.UNAUTHORIZED).entity("Unauthorized access").build();
		}
	}

	@GET
	@Path("/{category}")
	@Timed(name = "get-stakeHolders-by-category")
	public Response getStakeHoldersByCategory(@PathParam("category") String category , @HeaderParam("Auth-Token") String token) {
		StakeHolders stakeObj = new StakeHolders();
		if(stakeObj.getUser().isUserTokenValid(token))
		{

			try{
				return Response.status(200).entity( Lists.newArrayList(stakeObj.findStakeHolersByCategory(category))).build();
			}
			catch(Exception ex)
			{
				return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
			}
			finally
			{
				if(stakeObj != null)
				{
					stakeObj = null;
				}
			}
		}
		else
		{
			return Response.status(Response.Status.UNAUTHORIZED).entity("Unauthorized access").build();
		}


	}

}
