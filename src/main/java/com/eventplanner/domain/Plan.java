package com.eventplanner.domain;

import java.util.List;

import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

import com.eventplanner.config.DbConfig;
import com.eventplanner.dto.DataAccess;
import com.eventplanner.dto.LinksDto;

public class Plan extends LinksDto {
	
	//private static int planKey;
	
	public Plan() {
		//this.setId(++planKey);
	}
	
	@Id @ObjectId
	private int id;
	private Users user;
	private List<StakeHolders> stakeHolders;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public void getPlans()
	{
		DataAccess dao =null;
		try{
			dao = new DataAccess();
			dao.getDataFromCollection(DbConfig.collectionPlans);
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
	
	public List<Plan> findStakeHolders(String condition)
	{
		DataAccess dao =null;
		Iterable<Plan> filteredPlans = null;
		try{
			dao = new DataAccess();
			filteredPlans =dao.findData(DbConfig.collectionPlans,condition).as(Plan.class);
			return (List<Plan>) filteredPlans;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return (List<Plan>) filteredPlans;	
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
	
	public Plan findStakeHolder(String condition)
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



}
