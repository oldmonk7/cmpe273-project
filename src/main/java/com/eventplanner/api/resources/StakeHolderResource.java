package com.eventplanner.api.resources;

import com.eventplanner.domain.StakeHolders;
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
			stakeHolderToCreate.saveStakeHolder();
            String msg="{\"msg\":\"StakeHolder Created\"}";
            return Response.status(201).entity(msg).build();
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
    public Response getUsers() {
    	Iterable<StakeHolders> stakeHolders  =null;
    	StakeHolders stakeObj = new StakeHolders();
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
    
    @GET
    @Path("/{category}")
	@Timed(name = "get-stakeHolders-by-category")
    public Response getStakeHoldersByCategory(@PathParam("category") String category) {
    	StakeHolders stakeObj = new StakeHolders();
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

}
