package com.deloitte.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.deloitte.customer.db.CustomerJDBCOperations;

public class Client {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	System.out.println("\n   MENU  ");
	System.out.println("\n 1. print record");
			System.out.println("\n 2.Insert record");
			System.out.println("\n 3.Insert user record");
			System.out.println("\n 4.Insert user record using prepared statement");
			System.out.println("\n 5.Delete record");
	Scanner s=new Scanner(System.in);
System.out.println("\nEnter your choice");
	int o=s.nextInt();
	if(o==1)
		CustomerJDBCOperations.printRecords();
	
	else if(o==2)
		
		CustomerJDBCOperations.insertRecords();
else if(o==3)
		
		CustomerJDBCOperations.insertRecords2();
	
else if(o==4)
	
	CustomerJDBCOperations.insertRecords3();
	
	else
		CustomerJDBCOperations.deleteRecords();
	
}
}
