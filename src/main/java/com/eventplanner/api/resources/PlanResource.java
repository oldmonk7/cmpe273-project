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

import com.eventplanner.domain.Plan;
import com.eventplanner.domain.StakeHolders;
import com.google.common.collect.Lists;
import com.yammer.metrics.annotation.Timed;

@Path("/plan")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlanResource {
	
	@POST
	@Timed(name = "create-plan")
    public Response saveUser(@Valid Plan planToCreate) {
		try{
			planToCreate.savePlan();;
			return Response.status(201).entity("StakeHolder Created : \n"+ planToCreate.toList()).build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(planToCreate != null)
			{
				planToCreate= null;
			}
		}
    }
    
    @GET
	@Timed(name = "get-plans")
    public Response getPlans() {
    	Iterable<Plan> plans  =null;
    	Plan planObj = new Plan();
		try{
			plans = planObj.getPlans();			
			return Response.status(200).entity(Lists.newArrayList(plans)).build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(planObj != null)
			{
				planObj = null;
			}
			if(plans != null)
			{
				plans = null;
			}
		}
    }
    
    @GET
    @Path("/{number}")
	@Timed(name = "get-plan-by-number")
    public Response getStakeHoldersByCategory(@PathParam("number") int number) {
    	Plan planObj = new Plan();
		try{
			
			return Response.status(200).entity( Lists.newArrayList(planObj.findPlanByNumber(number))).build();
		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(planObj != null)
			{
				planObj = null;
			}
		}
    }

}
