package com.eventplanner.ui.resources;


import com.eventplanner.domain.StakeHolders;
import com.eventplanner.ui.views.StakeHolderView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.TEXT_HTML)
public class StakeHolderResource {

	//private  StakeHolders stakeholder;

	
	 public StakeHolderResource() {
			
		    }
	
//    public StakeHolderResource(StakeHolders stakeholder) {
//	this.stakeholder = stakeholder;
//    }


   

	@GET
    public  StakeHolderView getStakeHolders() {
//		StakeHolders stkd = StakeHolders.findOneStakeHolder("{description : \"TestStake1Holder\"}");
//		System.out.println(stkd);
	return new StakeHolderView(new StakeHolders());
    }

}

