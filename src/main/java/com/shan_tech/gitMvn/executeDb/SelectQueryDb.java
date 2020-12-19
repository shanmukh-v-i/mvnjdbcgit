package com.shan_tech.gitMvn.executeDb;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.shan_tech.gitMvn.connectionClass.ConnectDb;
 
public class SelectQueryDb {
    public static void main(String[] args) {
        Connection connection = null;
        
        Statement selectStmt = null;
        try
        {
           
            connection = ConnectDb.getCon();
            selectStmt = connection.createStatement();
            ResultSet rs = selectStmt.executeQuery("SELECT ID,EMAIL_ADDRESS,FIRST_NAME,LAST_NAME FROM EMPLOYEES");
            while(rs.next())
            {
                System.out.println(rs.getInt(1));    //First Column
                System.out.println(rs.getString(2));    //Second Column
                System.out.println(rs.getString(3));    //Third Column
                System.out.println(rs.getString(4));    //Fourth Column
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                selectStmt.close();
             
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
