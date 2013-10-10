package com.eventplanner.domain;

import java.util.List;

//import org.eclipse.jetty.server.Authentication.User;
import org.hibernate.validator.constraints.NotEmpty;
import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

import com.eventplanner.config.DbConfig;
import com.eventplanner.dto.DataAccess;
import com.eventplanner.dto.LinksDto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Users extends LinksDto {

	//private static int userkey = 0;
	public Users()
	{
		//this.id = ++userkey;
	}
	
	@NotEmpty(message ="Email ID cannot be  blank.")
	private String userNameEmail;
	
	private int userPhone;
	
	@NotEmpty(message ="Name cannot be  blank.")
	private String name;
	@Id @ObjectId
	private int id;
	
	@JsonProperty("name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonProperty("email")
	public String getUserNameEmail() {
		return userNameEmail;
	}
	public void setUserNameEmail(String userNameEmail) {
		this.userNameEmail = userNameEmail;
	}
	

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}
	
	public void saveUser()
	{
		DataAccess dao =null;
		try{
			dao = new DataAccess();
			dao.saveData(DbConfig.collectionUsers, this);
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
	
	public void getUsers()
	{
		DataAccess dao =null;
		try{
			dao = new DataAccess();
			dao.getDataFromCollection(DbConfig.collectionUsers);
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
	
	public List<Users> findUsers(String condition)
	{
		DataAccess dao =null;
		Iterable<Users> filteredUsers = null;
		try{
			dao = new DataAccess();
			filteredUsers =dao.findData(DbConfig.collectionUsers,condition).as(Users.class);
			return (List<Users>) filteredUsers;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return (List<Users>) filteredUsers;	
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
			if(filteredUsers != null)
			{
				filteredUsers = null;
			}
		}
	}
	
	public Users findUser(String condition)
	{
		DataAccess dao =null;
		Users filteredUser = null;
		try{
			dao = new DataAccess();
			filteredUser =dao.findOneData(DbConfig.collectionUsers,condition).as(Users.class);
			return filteredUser;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return filteredUser;	
			}
		finally
		{
			if(dao!=null)
			{
				dao =null;
			}
			if(filteredUser != null)
			{
				filteredUser = null;
			}
		}
	}

}
