package com.shan_tech.gitMvn.executeDb;

import java.sql.Connection;
import java.sql.Statement;

import com.shan_tech.gitMvn.connectionClass.ConnectDb;

public class InsertQueryDb {
	public static void insertData() {
		
		Connection connection = null;
        Statement insertStmt = null;
        try {
        	connection=ConnectDb.getCon();
        	insertStmt=connection.createStatement();
        	insertStmt.execute("INSERT INTO EMPLOYEE (EMAIL_ADDRESS,FIRST_NAME,LAST_NAME) VALUES ('shan@shan-tech.com','shan','inamdar')");
            insertStmt.execute("INSERT INTO EMPLOYEE (EMAIL_ADDRESS,FIRST_NAME,LAST_NAME) VALUES ('amit@shan-tech','amit','inamdar')");
        	
        }
        catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
