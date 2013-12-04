package com.eventplanner.ui.views;

import com.yammer.dropwizard.views.View;

import com.eventplanner.domain.Plan;
import com.eventplanner.domain.StakeHolders;
import com.eventplanner.domain.Users;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 12/3/13
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainView extends View{

    private final Plan plan;

    private final Users user;

    private final StakeHolders stakeHolder;

    private final List<StakeHolders> stakeHolders;

    private final List<Plan> plans;

    private final List<Users> users;

    public MainView(Plan plan,
                    Users user,
                    StakeHolders stakeHolder,
                    List<Users> users,
                    List<StakeHolders> stakeHolders,
                    List<Plan> plans){

         super("event.ftl");
        this.stakeHolder = stakeHolder;
        this.plan = plan;
        this.user = user;
        this.users = users;
        this.plans = plans;
        this.stakeHolders = stakeHolders;
    }


    public Plan getPlan() {
        return plan;
    }

    public Users getUser() {
        return user;
    }

    public StakeHolders getStakeHolder() {
        return stakeHolder;
    }

    public List<StakeHolders> getStakeHolders() {
        return stakeHolders;
    }

    public List<Plan> getPlans() {
        return plans;
    }

    public List<Users> getUsers() {
        return users;
    }
}
