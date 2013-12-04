package com.eventplanner.api.resources;

import com.eventplanner.domain.Plan;
import com.google.common.collect.Lists;
import com.yammer.metrics.annotation.Timed;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/plan")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PlanResource {
	
	@POST
	@Timed(name = "create-plan")
    public Response saveUser(@Valid Plan planToCreate) {
		try{
			planToCreate.savePlan();
            String msg = "{\"msg\":\"Plan Created\"}";
			return Response.status(201).entity(msg).build();
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
