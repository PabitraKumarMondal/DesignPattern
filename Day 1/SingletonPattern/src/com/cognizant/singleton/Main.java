package com.cognizant.singleton;

public class Main {
	public static void main(String[] args) {
		DBConn con = DBConn.getInstance();
		
		System.out.println(con.hashCode());
		
	}
}
