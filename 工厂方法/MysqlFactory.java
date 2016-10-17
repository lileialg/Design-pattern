package com.designpattern.factorymethod;

public class MysqlFactory implements Factory {

	public DatabaseConnection getConnection() {
		// TODO Auto-generated method stub
		return new MysqlConnection();
	}

}
