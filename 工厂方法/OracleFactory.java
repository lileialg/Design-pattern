package com.designpattern.factorymethod;

public class OracleFactory implements Factory {

	public DatabaseConnection getConnection() {
		// TODO Auto-generated method stub
		return new OracleConnection();
	}

}
