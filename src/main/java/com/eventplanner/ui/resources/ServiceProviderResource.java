package com.eventplanner.ui.resources;

import com.eventplanner.ui.views.ServiceProviderView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 11/13/13
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/serviceprovider")
@Produces(MediaType.TEXT_HTML)
public class ServiceProviderResource {

    @GET
    public ServiceProviderView serviceProviderView(){


    return new ServiceProviderView();
    }

}
