package com.eventplanner.domain;

import java.util.ArrayList;
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
	  // this.id = ++stakeholderKey;
	}
	
	private List<String> category;
	private Users user;
	private String description;
	@Id @ObjectId 
    private String key;
	
	
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
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
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
	
	public  Iterable<StakeHolders> getStakeHolders()
	{
		DataAccess dao =null;
		Iterable<StakeHolders> allStakeHolders = null;
		try{
			dao = new DataAccess();
			allStakeHolders = dao.getDataFromCollection(DbConfig.collectionStakeHolders).find().as(StakeHolders.class);
			return  allStakeHolders;
					
					
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return  allStakeHolders;
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
		}
	}
	
	public Iterable<StakeHolders> findStakeHolders(String condition)
	{
		DataAccess dao =null;
		Iterable<StakeHolders> filteredStakeHolders = null;
		try{
			dao = new DataAccess();
			filteredStakeHolders =dao.findData(DbConfig.collectionStakeHolders,condition).as(StakeHolders.class);
			return  filteredStakeHolders;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return  filteredStakeHolders;	
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
	
	public  StakeHolders findOneStakeHolder(String condition)
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
		
		public  StakeHolders findOneStakeHolder()
		{
			DataAccess dao =null;
			StakeHolders filteredStakeHolder = null;
			try{
				dao = new DataAccess();
				filteredStakeHolder =dao.findOneData(DbConfig.collectionStakeHolders).as(StakeHolders.class);
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
		
		public  Iterable<StakeHolders>  findStakeHolersByCategory(String category)
		{
			try{
				return findStakeHolders("{category : {$all: [\""+category+"\"]}}");
				 
			}
			 catch (Exception e) {
				 e.printStackTrace();
				 return null;	
				}
			finally
			{
				
			}
	}
		
		public List<String> toList()
		{
			List<String> obj = new ArrayList<String>();
			obj.add("ID : " + this.key);
			obj.add("Name : " + this.user.getName());
			obj.add("Phone : " + this.user.getPhone().longValue());
			obj.add("Email : " + this.user.getEmail());
			obj.add("Desc : " + this.description);
			obj.add("Category: "+this.category);
			
			return obj;	
		
		}
}
