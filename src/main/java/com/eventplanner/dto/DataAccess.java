package com.eventplanner.dto;

import java.math.BigInteger;
import java.net.UnknownHostException;

import org.bson.types.ObjectId;
import org.jongo.*;

import java.util.*;

import com.google.common.collect.Maps;
import com.eventplanner.config.DbConfig;
import com.eventplanner.domain.*;
import com.mongodb.Mongo;

import java.security.*;

public class DataAccess {

	private Jongo jongo;

	private final static Map<String,Users > UserAuthToken = Maps.newLinkedHashMap();
	//private final static Map<String,StakeHolders > StakeHolderAuthToken = Maps.newLinkedHashMap();


	/**
	 * Constructor - will get values from DBConfig & properties file
	 * @throws Exception 
	 */
	public DataAccess() throws Exception{
		Mongo mongo = null;
		//DbConfig.setDBConnectionVariables();
		try {
			mongo = new Mongo(DbConfig.dbHostName,DbConfig.dbPortNumber);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception ("Cannot connect to Mongo DB");
		}
		jongo = new Jongo(mongo.getDB(DbConfig.dbName));
	}

	/**
	 * Constructor
	 * @param dbHostName -String - Mongo DB Host Name
	 * @param dbPortNumber - Int - Port Number 
	 * @param dbName - String - DataBase Name
	 **/
	public DataAccess(String dbHostName, int dbPortNumber, String dbName){
		Mongo mongo = null;
		//DbConfig.setDBConnectionVariables();
		try {
			mongo = new Mongo(dbHostName ,dbPortNumber);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jongo = new Jongo(mongo.getDB(dbName));
	}

	/**** Hash Set Operations ****/
	public static Users getUserByToken(String token) {
		return UserAuthToken.get(token);
	}

	//	public static StakeHolders getStakeHolderByToken(String token) {
	//		return StakeHolderAuthToken.get(token);
	//	}

	public static void deleteUserToken(String token) {
		try 
		{
			UserAuthToken.remove(token);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//	public static void deleteStakeHolderToken(String token) {
	//		try 
	//		{
	//			StakeHolderAuthToken.remove(token);
	//			
	//		} catch (Exception e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//}


	public static Users addUserToken(final Users user) {

		MessageDigest mdEnc;
		try 
		{
			mdEnc = MessageDigest.getInstance("MD5");
			mdEnc.update(user.getName().getBytes(), 0, user.getName().length());
			String token = new BigInteger(1, mdEnc.digest()).toString(16);

			user.setToken(token);

			UserAuthToken.put(token, user);

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}

	//	public static StakeHolders addStakeHolderToken(final StakeHolders stakeholder) {
	//
	//		MessageDigest mdEnc;
	//		try 
	//		{
	//			mdEnc = MessageDigest.getInstance("MD5");
	//			mdEnc.update(stakeholder.getUser().getName().getBytes(), 0, stakeholder.getUser().getName().length());
	//			String token = new BigInteger(1, mdEnc.digest()).toString(16);
	//
	//			stakeholder.setToken(token);
	//
	//			StakeHolderAuthToken.put(token, stakeholder);
	//
	//		} catch (NoSuchAlgorithmException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//
	//		return stakeholder;
	//	}

	/**********************/

	public Jongo getJongo() {
		return jongo;
	}

	public void setJongo(Jongo jongo) {
		this.jongo = jongo;
	}


	//Get Data from Collection
	public MongoCollection getDataFromCollection(String collectionName){
		return jongo.getCollection(collectionName);
	}


	//Save data to Collection
	public <T> void saveData(String collection, List<T> objectToSave){
		MongoCollection coll = jongo.getCollection(collection);
		for(T item : objectToSave ){
			coll.save(item);
		}
	}

	public <T> void saveData(String collection, T objectToSave){
		MongoCollection coll = jongo.getCollection(collection);
		coll.save(objectToSave);
	}

	// Insert Data in Collection
	/**
	 * insert list of data into collection provided
	 * @param collection - String
	 * @param objectToInsert- List<T>- generic object preferred String
	 */
	public <T> void insertData(String collection, List<T> objectToInsert){
		MongoCollection coll = jongo.getCollection(collection);

		for(T item : objectToInsert ){
			coll.insert(item);
		}

	}

	/**
	 * insert data into collection provided
	 * @param collection - String
	 * @param objectToInsert - <T>- generic object preferred String
	 */
	public <T> void insertData(String collection, T objectToInsert){
		MongoCollection coll = jongo.getCollection(collection);
		coll.insert(objectToInsert);
	}


	//Update Data in Collection

	/**
	 * update list of data in the collection provided
	 * @param collection - String
	 * @param thingsToUpdate - String
	 * @param withCondition - String
	 */
	public void updateData(String collection, List<String> thingsToUpdate, String withCondition){
		MongoCollection coll = jongo.getCollection(collection);

		for(String item : thingsToUpdate ){
			coll.update(item).with(withCondition);
		}

	}

	/**
	 * update data in the Collection provided
	 * @param collection - String
	 * @param thingsToUpdate - String
	 * @param withCondition - String
	 */
	public void updateData(String collection, String thingsToUpdate, String withCondition){
		MongoCollection coll = jongo.getCollection(collection);
		coll.update(thingsToUpdate).with(withCondition);
	}

	//Delete data from Collection
	/**
	 * Removes list data from collection provided
	 * @param collection - String
	 * @param objectsToRemove - Collection of String or ObjectId
	 */
	public <T> void removeData(String collection, List<T> objectsToRemove){
		MongoCollection coll = jongo.getCollection(collection);

		for( T item : objectsToRemove ){
			if(item instanceof String)
			{
				coll.remove((String) item);
			}else{

				coll.remove((ObjectId) item);
			}
		}

	}

	/**
	 * Removes data from collection provided
	 * @param collection - String 
	 * @param objectToRemove - String or ObjectId
	 */
	public <T> void removeData(String collection, T objectToRemove){
		MongoCollection coll = jongo.getCollection(collection);
		if(objectToRemove instanceof String)
		{
			coll.remove((String) objectToRemove);
		}else{

			coll.remove((ObjectId) objectToRemove);
		}
	}

	/**
	 * Find values in collection
	 * @param collection - String
	 * @param condition - String
	 * @return
	 */
	public Find findData(String collection, String condition){
		return jongo.getCollection(collection).find(condition);
	}

	/**
	 * Find one values in collection -- top1 
	 * @param collection - String
	 * @param condition - String
	 * @return
	 */
	public FindOne findOneData(String collection, String condition){
		return jongo.getCollection(collection).findOne(condition);
	}

	public FindOne findOneData(String collection){
		return jongo.getCollection(collection).findOne();
	}

	public Find find(String collection){
		return jongo.getCollection(collection).find();

	}





}
