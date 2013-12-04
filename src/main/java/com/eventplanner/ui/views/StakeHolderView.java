package com.eventplanner.ui.views;

import com.eventplanner.domain.StakeHolders;
import com.yammer.dropwizard.views.View;

//import com.eventplanner.domain.StakeHolders;
//import com.eventplanner.ui.resources.StakeHolderResourcetest;

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



