package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.AboutView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 12/4/13
 * Time: 7:33 AM
 * To change this template use File | Settings | File Templates.
 */
@Path("/about")
@Produces(MediaType.TEXT_HTML)
public class AboutResource {

    @GET
    public AboutView getAboutView(){

                   return new AboutView();

    }




}
