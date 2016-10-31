package com.designpattern.template;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public abstract class DataQuery {

	public final void query() throws Exception{
		Connection conn = this.getConnection();
		
		String sql = this.getSql();
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			
			//Êä³ö
		}
		
		rs.close();
		
		stmt.close();
		
		conn.close();
	}
	
	public abstract Connection getConnection()throws Exception;
	
	public abstract String getSql();
}
