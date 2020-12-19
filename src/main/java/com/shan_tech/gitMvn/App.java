package com.shan_tech.gitMvn;

import java.util.Scanner;

import com.shan_tech.gitMvn.executeDb.InsertQueryDb;
import com.shan_tech.gitMvn.executeDb.SelectQueryDb;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	switch(sc.nextInt()) {
    	case 1:InsertQueryDb.insertData();
    	case 2:SelectQueryDb.selectDb();
    	default:System.out.println("Select case 1 or case 2 only");
    }
    }
}
