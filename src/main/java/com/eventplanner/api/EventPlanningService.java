package com.eventplanner.api;

import com.eventplanner.config.DbConfig;
import com.eventplanner.config.EventPlanningServiceConfiguration;
import com.eventplanner.resources.LoginResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class EventPlanningService extends Service<EventPlanningServiceConfiguration> {

    public static void main(String[] args) throws Exception {
	new EventPlanningService().run(args);
    }

    @Override
    public void initialize(Bootstrap<EventPlanningServiceConfiguration> bootstrap) {
	bootstrap.setName("eventplanner-service");
    }

    @Override
    public void run(EventPlanningServiceConfiguration configuration,
	    Environment environment) throws Exception {
	environment.addResource(new LoginResource());
	
	
	DbConfig.setDBConnectionVariables();
    }

}
