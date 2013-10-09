package com.eventplanner.dto;

import java.net.UnknownHostException;
import java.util.List;

import org.bson.types.ObjectId;
import org.jongo.Find;
import org.jongo.FindOne;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import com.eventplanner.config.DbConfig;
import com.eventplanner.domain.Users;
import com.mongodb.Mongo;

public class DataAccess {
	
	private Jongo jongo;
	
	/**
	 * Constructor - will get values from DBConfig & properties file
	 */
	public DataAccess(){
		Mongo mongo = null;
		//DbConfig.setDBConnectionVariables();
		try {
			mongo = new Mongo(DbConfig.dbHostName,DbConfig.dbPortNumber);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
	
	
	
	

}
