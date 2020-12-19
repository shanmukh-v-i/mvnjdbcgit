package com.shan_tech.gitMvn;

import java.util.Scanner;

import com.shan_tech.gitMvn.executeDb.InsertQueryDb;
import com.shan_tech.gitMvn.executeDb.SelectQueryDb;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	switch(sc.nextInt()) {
    	case 1:InsertQueryDb.insertData();
    		   break;
    	case 2:SelectQueryDb.selectDb();
    		   break;
    	default:System.out.println("Select case 1 or case 2 only");
    }
    }
}
