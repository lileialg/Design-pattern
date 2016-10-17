package com.designpattern.factorymethod;

public class PgFactory implements Factory {

	public DatabaseConnection getConnection() {
		// TODO Auto-generated method stub
		return new PgConnection();
	}

}
