package com.designpattern.simplyfactory;

import java.sql.Connection;

public abstract class DatabaseConnection {

	private String dbName;
	
	private int port;
	
	private String username;
	
	private String password;
	
	public abstract Connection getConnection();
}
