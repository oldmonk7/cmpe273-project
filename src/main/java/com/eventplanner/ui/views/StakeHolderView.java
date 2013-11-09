package com.eventplanner.ui.views;

import java.util.List;

import com.eventplanner.domain.StakeHolders;
//import com.eventplanner.domain.StakeHolders;
//import com.eventplanner.ui.resources.StakeHolderResource;
import com.yammer.dropwizard.views.View;

public class StakeHolderView extends View {

	private final StakeHolders stakeholder;
	
	public StakeHolderView(StakeHolders stakeholder) {
		super("test.ftl");
		this.stakeholder = stakeholder;
	    }

	public StakeHolders getStakeholder() {
		return stakeholder;
	}
	
	//public List<StakeHolders> getStakeholders() {
		//return stakeholder.getStakeHolders();
	//}
    
   
}



