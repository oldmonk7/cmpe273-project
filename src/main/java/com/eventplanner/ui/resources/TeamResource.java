package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.TeamView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 12/4/13
 * Time: 8:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Path("/team")
@Produces(MediaType.TEXT_HTML)
public class TeamResource {

    @GET
    public TeamView getTeamView(){

        return new TeamView();

    }

}
