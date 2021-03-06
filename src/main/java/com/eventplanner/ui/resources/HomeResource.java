package com.eventplanner.ui.resources;

import com.eventplanner.domain.StakeHolders;
import com.eventplanner.ui.views.HomeView;
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
@Path("/home")
@Produces(MediaType.TEXT_HTML)
public class HomeResource {

    private StakeHolders stakeHolders = new StakeHolders();

    public HomeResource() {

    }

    @GET
       public HomeView getHome() {

          List<StakeHolders> stakeHoldersList = Lists.newArrayList(stakeHolders.getStakeHolders());
           return new HomeView(stakeHoldersList);

   }



}
