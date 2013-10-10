/**
 * 
 */
package com.eventplanner.common;

//import org.apache.commons.codec.binary.Base64;
import java.io.*;
import java.util.*;

import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.PostMethod;

import com.eventplanner.domain.Users;

/**
 * @author kavish.parikh
 *
 */
public class StormPathAuthentication {

	private boolean status = false; 
	
	public StormPathAuthentication() {
		// TODO Auto-generated constructor stub
	}

	public boolean createUser(Users userToCreate) throws HttpException, IOException{
		
			 userToCreate.getName();
		     //HttpClient httpClient = new HttpClient("");
		     String url = "http://search.yahoo.com/search";
		     //try {
		      HttpClient client = new HttpClient();
		      PostMethod method = new PostMethod("https://api.stormpath.com/v1/applications/5AwlNi9zqtl972Kr4gr77E");
		      method.addParameter("givenName",userToCreate.getName());
		      method.addParameter("Email",userToCreate.getUserNameEmail());	
		      method.addParameter("Password",userToCreate.getUserPassword());
		      //method.addParameter("Status",userToCreate.getName());
		      String contents = null;
		  	 // Execute the POST method
		      int statusCode = client.executeMethod( method );
		      if( statusCode != -1 ) {
		        
				try {
					contents = method.getResponseBodyAsString();
				} catch (IOException e) {
					e.printStackTrace();
				}
		        method.releaseConnection();
		        System.out.println(contents);
		      }
		
		return status;
	}
	
//	public boolean validateUser(String username, String password){
//		String authenticate = username+":"+password;
//        System.out.println("-------------"+authenticate+"-------------"); 
//        byte[] bytes = Base64.encodeBase64(authenticate);
//        String value = new String(bytes);
//        System.out.println("Base64 Encoded String : " + new String(value));
//      	return status;
//	}
//	
//	public void deleteUser(){
//		
//	}
	
	
}
