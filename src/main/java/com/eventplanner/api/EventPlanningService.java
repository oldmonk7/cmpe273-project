package com.eventplanner.api;

import com.eventplanner.api.resources.LoginResource;
import com.eventplanner.api.resources.PlanResource;
import com.eventplanner.api.resources.RootResources;
import com.eventplanner.api.resources.UserResource;
import com.eventplanner.config.DbConfig;
import com.eventplanner.config.EventPlanningServiceConfiguration;
import com.eventplanner.ui.resources.*;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.views.ViewBundle;
public class EventPlanningService extends Service<EventPlanningServiceConfiguration> {

    public static void main(String[] args) throws Exception {
	new EventPlanningService().run(args);
    }

    @Override
    public void initialize(Bootstrap<EventPlanningServiceConfiguration> bootstrap) {
   
   	bootstrap.setName("eventplanner-service");
	bootstrap.addBundle(new ViewBundle());
    bootstrap.addBundle(new AssetsBundle());
	//DbConfig.setDBConnectionVariables();
    }

    @Override
    public void run(EventPlanningServiceConfiguration configuration,
	    Environment environment) throws Exception { 
    	
    	 DbConfig.dbHostName = configuration.getDbhost();
    	 DbConfig.dbPortNumber = configuration.getDbport();
    	 DbConfig.dbName = configuration.getDatabasename();
    	 DbConfig.dbUserName = configuration.getDbusername();
    	 DbConfig.dbPassword = configuration.getDbpassword();
    	 DbConfig.collectionUsers = configuration.getDbcollectionusers(); 
    	 DbConfig.collectionStakeHolders = configuration.getDbcollectionstakeholders();
    	 DbConfig.collectionPlans = configuration.getDbcollectionplans();
    	
    environment.addResource(LoginResource.class);
	environment.addResource(RootResources.class);
	environment.addResource(StakeHolderResource.class);
	environment.addResource(UserResource.class);
	environment.addResource(PlanResource.class);


     //UI Resources

        environment.addResource(SignUpResource.class);
        environment.addResource(HomeResource.class);
        environment.addResource(CustomerResource.class);
        environment.addResource(ServiceProviderResource.class);
	
	
	
    }

}
