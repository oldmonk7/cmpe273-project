package com.eventplanner.ui.views;

import com.eventplanner.domain.Plan;
import com.yammer.dropwizard.views.View;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 11/10/13
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */


public class MyPlanView extends View {

    private final List<Plan> plans;

    public MyPlanView(List<Plan> plans){
        super("myplan.ftl");
        this.plans = plans;


    }

    public List<Plan> getPlans(){

        return plans;
    }
}
