package com.eventplanner.ui.resources;

import com.eventplanner.domain.StakeHolders;
import com.eventplanner.ui.views.MakePlanView;
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
@Path("/plan/build")
@Produces(MediaType.TEXT_HTML)
public class MakePlanResource {

    private StakeHolders stakeHolders = new StakeHolders();

    public MakePlanResource() {

    }

    @GET
    public MakePlanView getPlanView() {

        List<StakeHolders> stakeHoldersList = Lists.newArrayList(stakeHolders.getStakeHolders());
        return new MakePlanView(stakeHoldersList);

    }



}
