package com.eventplanner.config;

import com.yammer.dropwizard.config.Configuration;

public class EventPlanningServiceConfiguration extends Configuration {


private String dbhost;
private int dbport;
private String databasename;
private String dbusername;
private String dbpassword;
private String dbcollectionusers;
private String dbcollectionstakeholders;
private String dbcollectionplans;
/**
 * @return the dbhost
 */
public String getDbhost() {
	return dbhost;
}
/**
 * @param dbhost the dbhost to set
 */
public void setDbhost(String dbhost) {
	this.dbhost = dbhost;
}
/**
 * @return the dbport
 */
public int getDbport() {
	return dbport;
}
/**
 * @param dbport the dbport to set
 */
public void setDbport(int dbport) {
	this.dbport = dbport;
}
/**
 * @return the databasename
 */
public String getDatabasename() {
	return databasename;
}
/**
 * @param databasename the databasename to set
 */
public void setDatabasename(String databasename) {
	this.databasename = databasename;
}
/**
 * @return the dbusername
 */
public String getDbusername() {
	return dbusername;
}
/**
 * @param dbusername the dbusername to set
 */
public void setDbusername(String dbusername) {
	this.dbusername = dbusername;
}
/**
 * @return the dbpassword
 */
public String getDbpassword() {
	return dbpassword;
}
/**
 * @param dbpassword the dbpassword to set
 */
public void setDbpassword(String dbpassword) {
	this.dbpassword = dbpassword;
}
/**
 * @return the dbcollectionusers
 */
public String getDbcollectionusers() {
	return dbcollectionusers;
}
/**
 * @param dbcollectionusers the dbcollectionusers to set
 */
public void setDbcollectionusers(String dbcollectionusers) {
	this.dbcollectionusers = dbcollectionusers;
}
/**
 * @return the dbcollectionstakeholders
 */
public String getDbcollectionstakeholders() {
	return dbcollectionstakeholders;
}
/**
 * @param dbcollectionstakeholders the dbcollectionstakeholders to set
 */
public void setDbcollectionstakeholders(String dbcollectionstakeholders) {
	this.dbcollectionstakeholders = dbcollectionstakeholders;
}
/**
 * @return the dbcollectionplans
 */
public String getDbcollectionplans() {
	return dbcollectionplans;
}
/**
 * @param dbcollectionplans the dbcollectionplans to set
 */
public void setDbcollectionplans(String dbcollectionplans) {
	this.dbcollectionplans = dbcollectionplans;
}
	
	
}
