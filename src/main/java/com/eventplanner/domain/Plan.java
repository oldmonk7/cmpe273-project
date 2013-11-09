package com.eventplanner.domain;

import java.util.ArrayList;
import java.util.List;

import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

import com.eventplanner.config.DbConfig;
import com.eventplanner.dto.DataAccess;
import com.eventplanner.dto.LinksDto;

public class Plan extends LinksDto {
	
	private static int planKey;
	
	public Plan() {
		this.setNumber(++planKey);
	}
	
	@Id @ObjectId 
    private String key;
	private int number;
	private Users user;
	private List<StakeHolders> stakeHolders;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public List<StakeHolders> getStakeHolders() {
		return stakeHolders;
	}

	public void setStakeHolders(List<StakeHolders> stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	public void addStakeHolders(StakeHolders stakeHolder) {
		this.stakeHolders.add(stakeHolder);
	}
	
	public void removeStakeHolders(StakeHolders stakeHolder) {
		this.stakeHolders.remove(stakeHolder);
	}

	
	public void savePlan()
	{
		DataAccess dao =null;
		try{
			dao = new DataAccess();
			dao.saveData(DbConfig.collectionPlans, this);
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
		}
	}
	
	public Iterable<Plan> getPlans()
	{
		DataAccess dao =null;
		Iterable<Plan> plans = null;
		try{
			dao = new DataAccess();
			plans = dao.find(DbConfig.collectionPlans).as(Plan.class);
			return plans;
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return plans;
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
			if(plans!=null)
			{
				plans =null;
			}
		}
	}
	
	public Iterable<Plan> findPlans(String condition)
	{
		DataAccess dao =null;
		Iterable<Plan> filteredPlans = null;
		try{
			dao = new DataAccess();
			filteredPlans =dao.findData(DbConfig.collectionPlans,condition).as(Plan.class);
			return filteredPlans;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return filteredPlans;	
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
			if(filteredPlans != null)
			{
				filteredPlans = null;
			}
		}
	}
	
	public Plan findPlan(String condition)
	{
		DataAccess dao =null;
		Plan filteredPlan = null;
		try{
			dao = new DataAccess();
			filteredPlan =dao.findOneData(DbConfig.collectionPlans,condition).as(Plan.class);
			return filteredPlan;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return filteredPlan;	
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
			if(filteredPlan != null)
			{
				filteredPlan = null;
			}
		}
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public List<String> toList()
	{
		List<String> obj = new ArrayList<String>();
		obj.add("ID : " + this.key);
		obj.add("Plan Number : " + this.number);
		obj.add("User : " + this.getUser());
		obj.add("StakeHolders : " + this.getStakeHolders());
		return obj;	
	
	}
	
	
	
	public Plan findPlanByNumber(int number)
	{
		try{
			return findPlan("{number : "+number+"}");
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return null;	
			}
		finally
		{
			
		}
	}




}
