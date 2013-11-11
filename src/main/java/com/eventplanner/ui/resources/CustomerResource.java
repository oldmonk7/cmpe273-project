package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.CustomerView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 11/10/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */

@Path("/customer")
@Produces(MediaType.TEXT_HTML)

public class CustomerResource {

    @GET
    public CustomerView getCustomerPage(){

        return new CustomerView();

    }




}
