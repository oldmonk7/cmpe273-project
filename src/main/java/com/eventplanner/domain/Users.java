package com.eventplanner.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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
	private String email;
	
	private Double phone;
	
	@NotEmpty(message ="Name cannot be  blank.")
	private String name;
	@Id @ObjectId 
    private String key;
	@NotEmpty(message ="Password cannot be blank.")
	private String password;

	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	@JsonProperty("name")
	public String getName() {
		return name.toLowerCase();
	}
	public void setName(String name) {
		this.name = name.toLowerCase();
	}
	
	@JsonProperty("email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonProperty("password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Double getPhone() {
		return phone;
	}

	public void setPhone(Double phone) {
		this.phone = phone;
	}
	
	public void saveUser()
	{
		DataAccess dao =null;
		try{
			dao = new DataAccess();
			dao.saveData(DbConfig.collectionUsers, this);
		}
		 catch (Exception e) {
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
	
	public Iterable<Users> getUsers()
	{
		DataAccess dao =null;
		Iterable<Users> users = null;
		try{
			dao = new DataAccess();
			users = dao.find(DbConfig.collectionUsers).as(Users.class);
			return users;
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return users;
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
			filteredUser = dao.findOneData(DbConfig.collectionUsers,condition).as(Users.class);
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
	
	public Users findUserByName(String name)
	{
		return findUser("{name : \""+name.toLowerCase()+"\" }");
	
	}
	
	public List<String> toList()
	{
		List<String> obj = new ArrayList<String>();
		obj.add("ID : " + this.key);
		obj.add("Name : " + this.name);
		obj.add("Phone : " + this.phone.longValue());
		obj.add("Email : " + this.email);
		return obj;	
	
	}

}
