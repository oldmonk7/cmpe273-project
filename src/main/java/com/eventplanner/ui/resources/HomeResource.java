package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.HomeView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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


       @GET
       public HomeView getHome() {
           return new HomeView();

   }



}
