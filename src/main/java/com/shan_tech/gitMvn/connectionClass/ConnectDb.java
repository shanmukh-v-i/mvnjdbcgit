package com.shan_tech.gitMvn.connectionClass;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb {
	
	static Connection con=null;
	
	public static Connection getCon() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager
		    .getConnection("jdbc:mysql://localhost:3306/springbootjpa", "root", "root");
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
