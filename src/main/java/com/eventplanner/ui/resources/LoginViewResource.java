package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.ViewLogin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 12/4/13
 * Time: 9:44 AM
 * To change this template use File | Settings | File Templates.
 */

@Path("/login")
@Produces(MediaType.TEXT_HTML)
public class LoginViewResource {

    @GET
    public ViewLogin getViewLogin(){

        return new ViewLogin();

    }



}
