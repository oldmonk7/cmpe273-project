package com.eventplanner.domain;

import com.eventplanner.config.DbConfig;
import com.eventplanner.dto.DataAccess;
import com.eventplanner.dto.LinksDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
import org.jongo.marshall.jackson.oid.Id;
import org.jongo.marshall.jackson.oid.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class Users extends LinksDto {

	//private static int userkey = 0;
	public Users()
	{
		//addUserToken() ;
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
	
	private String token;
	private String type;

	
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
	
	public Iterable<Users> findUsers(String condition)
	{
		DataAccess dao =null;
		Iterable<Users> filteredUsers = null;
		try{
			dao = new DataAccess();
			filteredUsers =dao.findData(DbConfig.collectionUsers,condition).as(Users.class);
			return  filteredUsers;
		}
		 catch (Exception e) {
			 e.printStackTrace();
			 return  filteredUsers;	
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
		return findUser("{name:\""+name.toLowerCase()+"\"}");
	
	}
	
	public Users findUserByEmail(String email)
	{
		return findUser("{email:\""+email+"\"}");
	
	}
	
	public List<String> toList()
	{
		List<String> obj = new ArrayList<String>();
		obj.add("ID : " + this.key);
		obj.add("Name : " + this.name);
		obj.add("Phone : " + this.phone.longValue());
		obj.add("Email : " + this.email);
		obj.add("Token : " + this.token);
		return obj;	
	
	}
	
	public String toResponseList()
	{
	   String jsonmsgtoken = "{\"user\":\""+name+"\",\"auth\":\""+token+"\"}";

		return jsonmsgtoken;

	}
	
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	public void addUserToken() {
		
		try{
				DataAccess.addUserToken(this);
		   }
		 catch (Exception e) {
				e.printStackTrace();
			}
		finally
		{
			
		}
	}
		public void deleteUserToken(String token) {
				
				try{
						DataAccess.deleteUserToken(token);;
				   }
				 catch (Exception e) {
						e.printStackTrace();
					}
				finally
				{
					
				}
			}
		public boolean isUserTokenValid(String token) {
				
				try{
					 Users authUser =	DataAccess.getUserByToken(token);
					 if(null!= authUser)
					 {
						 return true;
					 }
					 return false;
				   }
				 catch (Exception e) {
					 	e.printStackTrace();
					 	return false;
					}
				finally
				{
					
				}
			}
		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}
		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}

}
