package com.designpattern.template;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDataQuery extends DataQuery {

	@Override
	public Connection getConnection() throws Exception {
		// TODO Auto-generated method stub
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@192.168.8.1:1521:yuewei", "scott", "tiger");

		return conn;
	}

	@Override
	public String getSql() {
		// TODO Auto-generated method stub
		return "select * from tab1 a,tab2 b where a.id=b.id(+)";
	}

}
