package com.eventplanner.api.resources;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.eventplanner.domain.Users;
import com.sun.jersey.api.core.HttpRequestContext;
import com.yammer.metrics.annotation.Timed;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LoginResource {

	public LoginResource() {
	}


	@POST
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Timed(name = "login-users")
	public Response loginUser(@HeaderParam("Email") String email, @HeaderParam("Password") String password) {
		Users obj = new Users();

		try{
			if(null!= email || null!= password)
			{

				//	Users user = new Users();
				obj  = obj.findUserByEmail(email);

				if(null != obj)
				{
					if(obj.getPassword().equals(password))
					{
						obj.addUserToken();
						return Response.status(Response.Status.OK).entity(obj.toResponseList()).build();
					}
					else
					{
						return Response.status(Response.Status.UNAUTHORIZED).entity("Password not valid").build();
					}

				}
				else
				{
					return Response.status(Response.Status.UNAUTHORIZED).entity("User Id not valid").build();
				}
			}else
			{
				return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters ").build();
			}

		}
		catch(Exception ex)
		{
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
		}
		finally
		{
			if(obj != null)
			{
				obj= null;
			}
		}
	}


	@POST
	@Path("/logout")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Timed(name = "logout-users")
	public Response logoutUser(@HeaderParam("Auth-Token") String token) {
		Users obj = new Users();

		if(obj.isUserTokenValid(token))
		{
			obj.deleteUserToken(token);;
			return Response.status(Response.Status.OK).entity("{\"msg:\" : \"Logged out Successfully\"}").build();
		}
		else
		{
			return Response.status(Response.Status.UNAUTHORIZED).entity("Unauthorized access").build();
		}



	}
	//    
	//    @GET
	//	@Timed(name = "view-stakeholders")
	//	 public Response getStakeHolders() {
	//		try{
	//			//StakeHolders.getStakeHolders();
	//			
	//			
	//			return Response.status(200).entity("{msg : CustomerCreated}").build();
	//		}
	//		catch(Exception ex)
	//		{
	//			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
	//		}
	//		finally
	//		{
	//			if(null != null)
	//			{
	//				//null = null;
	//			}
	//		}
	//    }
	//
	//    @POST
	//    @Path("/serviceprovider")
	//	@Timed(name = "create-stakeholders")
	//    public Response saveStakeHolders(@Valid StakeHolders stakeHolderToCreate) {
	//		try{
	//             String msg="{\"msg\":\"StakeHolder Created\"}";
	//			return Response.status(201).entity(msg).build();
	//		}
	//		catch(Exception ex)
	//		{
	//			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
	//		}
	//		finally
	//		{
	//			if(null != null)
	//			{
	//				//null = null;
	//			}
	//		}
	//    }
	//    
	//    @POST
	//    @Path("/customer")
	//	@Timed(name = "create-user")
	//    public Response saveUser(@Valid Users userToCreate) {
	//		try{
	//			userToCreate.addUserToken();
	//			userToCreate.saveUser();
	//           
	//			String msg = "{\"msg\":\"Customer Created\"}";
	//           
	//            System.out.println((Response.status(201).entity(msg).build().getEntity()));
	//
	//
	//			return Response.status(201).entity(msg).build();
	//		}
	//		catch(Exception ex)
	//		{
	//			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
	//		}
	//		finally
	//		{
	//			if(null != null)
	//			{
	//				//null = null;
	//			}
	//		}
	//    }
	//    
	//
	//
	//	@GET
	//    @Path("/customer")
	//	@Timed(name = "create-user")
	//    public Response getUsers() {
	//		try{
	//			Users obj = new Users();
	//			//Iterable<Users> user = obj.getUsers();
	//			
	//			
	//			return Response.status(200).entity(obj.getUsers()).build();
	//		}
	//		catch(Exception ex)
	//		{
	//			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid Parameters " + ex.getMessage()).build();
	//		}
	//		finally
	//		{
	//			if(null != null)
	//			{
	//				//null = null;
	//			}
	//		}
	//    }

}

