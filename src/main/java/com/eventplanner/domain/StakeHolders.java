package com.eventplanner.domain;

import java.util.List;

import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

import com.eventplanner.config.DbConfig;
import com.eventplanner.dto.DataAccess;
import com.eventplanner.dto.LinksDto;

public class StakeHolders extends LinksDto{

	//private static int stakeholderKey = 0;
	public StakeHolders()
	{
	   //this.id = ++stakeholderKey;
	}
	
	private List<String> category;
	private Users user;
	private String description;
	@Id @ObjectId
	private int id;
	
	
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}
	
	public void addCategory(String category) {
		this.category.add(category);
	}
	
	public void removeCategory(String category) {
		this.category.remove(category);
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void saveStakeHolder()
	{
		DataAccess dao =null;
		try{
			dao = new DataAccess();
			dao.saveData(DbConfig.collectionStakeHolders, this);
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
	
	public void getStakeHolders()
	{
		DataAccess dao =null;
		try{
			dao = new DataAccess();
			dao.getDataFromCollection(DbConfig.collectionStakeHolders);
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
	
	public List<StakeHolders> findStakeHolders(String condition)
	{
		DataAccess dao =null;
		Iterable<StakeHolders> filteredStakeHolders = null;
		try{
			dao = new DataAccess();
			filteredStakeHolders =dao.findData(DbConfig.collectionStakeHolders,condition).as(StakeHolders.class);
			return (List<StakeHolders>) filteredStakeHolders;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return (List<StakeHolders>) filteredStakeHolders;	
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
			if(filteredStakeHolders != null)
			{
				filteredStakeHolders = null;
			}
		}
	}
	
	public StakeHolders findOneStakeHolder(String condition)
	{
		DataAccess dao =null;
		StakeHolders filteredStakeHolder = null;
		try{
			dao = new DataAccess();
			filteredStakeHolder =dao.findOneData(DbConfig.collectionStakeHolders,condition).as(StakeHolders.class);
			return filteredStakeHolder;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return filteredStakeHolder;	
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
			if(filteredStakeHolder != null)
			{
				filteredStakeHolder = null;
			}
		}
	}
}
