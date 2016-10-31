package com.designpattern.template;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDataQuery extends DataQuery {

	@Override
	public Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");;
		Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/javademo", "scott", "tiger");

		return conn;
	}

	@Override
	public String getSql() {
		// TODO Auto-generated method stub
		return "select * from tab1 a left join tab2 b on (a.id = b.id)";
	}

}
