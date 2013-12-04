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

import com.eventplanner.common.SendMail;
import com.eventplanner.domain.Plan;
import com.eventplanner.domain.Users;
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
			
			//notifying customers
			Users userObj = new Users().findUserByName(planToCreate.getUser());
			String subjectUser = "Service providers Notified!";
			String bodyUser = "Hi "+planToCreate.getUser()+","+
					"\n \n All the Service providers you have selected are notified."+
					"\n They will contact you soon.";
				new SendMail( userObj.getEmail(), subjectUser , bodyUser);

				
			// notifying service providers
				String subjectStackholders = "Event planner notification";
			for(String stakeholders : planToCreate.getStakeHolders())
			{
				Users stakeholderObj = new Users().findUserByName(stakeholders);
				 String bodyStackhoder = "Hi "+stakeholders+ ","+
						 			"\n \n"+ planToCreate.getUser()+ "  is planning to use your service. \n \n"
						 			+ "\n Here is your customer details : \n"
						 			+"Customer name: "+planToCreate.getUser()
						 			+"\n Email ID: "+userObj.getEmail()
						 			+"\n Cell No.: "+userObj.getPhone();
				 new SendMail(stakeholderObj.getEmail(),subjectStackholders,bodyStackhoder);
						 			
			}
			
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
