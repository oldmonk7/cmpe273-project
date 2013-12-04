package com.eventplanner.ui.resources;

import com.eventplanner.domain.Plan;
import com.eventplanner.domain.StakeHolders;
import com.eventplanner.domain.Users;
import com.eventplanner.ui.views.MainView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: shankey
 * Date: 12/3/13
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainViewResouce {

    private Plan plan = new Plan();
    private StakeHolders stakeHolder = new StakeHolders();
    private Users user = new Users();

    List<Plan> plans = null;
    List<StakeHolders> stakeHolders = null;
    List<Users> users =null;


    public MainViewResouce(){}


    public MainView getMainView(){


        return new MainView(plan,
                            user,
                            stakeHolder,
                            users,
                            stakeHolders,
                            plans);
    }






}
