package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.LoginView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 11/10/13
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */

@Path("/index")
@Produces(MediaType.TEXT_HTML)
public class SignUpResource {

    @GET
    public LoginView getHome() {
        return new LoginView();
    }
}

