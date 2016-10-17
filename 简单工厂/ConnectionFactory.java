package com.designpattern.simplyfactory;


public class ConnectionFactory {

	public DatabaseConnection getConnection(int dbType) {

		switch (dbType) {
		case 1:
			return new OracleConnection();
		case 2:
			return new MysqlConnection();
		case 3:
			return new PgConnection();
		default:
			return null;
		}

	}
}
