package com.cognizant.singleton;

public class DBConn {
	private static DBConn instance = new DBConn();
	
	public static DBConn getInstance() {
		return instance;
	}
	
	
	private DBConn() {
		
	}
	
}
