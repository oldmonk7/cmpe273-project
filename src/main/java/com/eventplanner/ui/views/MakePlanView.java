package com.eventplanner.ui.views;

import com.eventplanner.domain.StakeHolders;
import com.yammer.dropwizard.views.View;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 11/10/13
 * Time: 4:33 PM
 * To change this template use File | Settings | File Templates.
 */




public class MakePlanView extends View {

    private final List<StakeHolders> stakeHolders;

    public MakePlanView(List<StakeHolders> stakeHolders){
        super("plan.ftl");

        this.stakeHolders = stakeHolders;
    }

    public List<StakeHolders> getStakeHolders(){

        return stakeHolders;
    }
}



