package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.RegisterView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 12/4/13
 * Time: 7:54 AM
 * To change this template use File | Settings | File Templates.
 */
 @Path("/register")
 @Produces(MediaType.TEXT_HTML)
public class RegisterResource {

    @GET
    public RegisterView getRegisterView(){

        return new RegisterView();
    }

}
