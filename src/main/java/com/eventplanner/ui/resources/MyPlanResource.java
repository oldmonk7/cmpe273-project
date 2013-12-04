package com.eventplanner.ui.resources;

import com.eventplanner.domain.Plan;
import com.eventplanner.domain.StakeHolders;
import com.eventplanner.ui.views.MyPlanView;
import com.google.common.collect.Lists;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
//import java.util.ArrayList;
//import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 11/10/13
 * Time: 4:36 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/myplans")
@Produces(MediaType.TEXT_HTML)
public class MyPlanResource {

    private StakeHolders stakeHolders = new StakeHolders();
    private Plan plans = new Plan();

    public MyPlanResource() {

    }

    @GET
    public MyPlanView getPlanView() {

        List<StakeHolders> stakeHoldersList = Lists.newArrayList(stakeHolders.getStakeHolders());
        return new MyPlanView((List<Plan>) plans);

    }

}