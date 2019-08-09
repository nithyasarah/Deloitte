package com.deloitte.customer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.deloitte.dbcon.DbUtility;

public class CustomerJDBCOperations {

	public static void printRecords() throws ClassNotFoundException, SQLException {
		Connection connection= DbUtility.getMyConnection();
			System.out.println("Driver Loaded");
			
			Statement statement=connection.createStatement();
			ResultSet res=statement.executeQuery("select * from hr.customer");
			while (res.next())
			{System.out.print(res.getInt(1) + "    ");
			System.out.print(res.getString(2) + "   ");
			System.out.print(res.getString(3)+ "   ");
			System.out.println(res.getString(4));
			}
	}
	
	public static void insertRecords() throws ClassNotFoundException, SQLException {
		Connection connection= DbUtility.getMyConnection();
			
			Statement statement=connection.createStatement();
			
	
			int i=statement.executeUpdate("insert into hr.customer values(1,'Pooja', 'Kanpur',6500)");
			System.out.println(i+ " row affected");
	}
	
	
	
	public static void insertRecords2() throws ClassNotFoundException, SQLException {
		Connection connection= DbUtility.getMyConnection();
			
			Statement statement=connection.createStatement();
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Customer Details");
			int id=s.nextInt();
			String name=s.next();
			String address=s.next();
			int amount =s.nextInt();
			int qu=statement.executeUpdate("insert into hr.customer values("+id+", '"+name+"', '"+address+"',"+amount+")");
			System.out.println(qu+ " row affected");
			
			
			
			
	}
	
	public static void insertRecords3() throws ClassNotFoundException, SQLException {
		
		
System.out.println("\n Using Prepared Statement\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Customer Details");
		int id=s.nextInt();
		String name=s.next();
		String address=s.next();
		int amount =s.nextInt();
		
		Connection connection= DbUtility.getMyConnection();
			
			PreparedStatement statement=connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setString(3, address);
			statement.setInt(4, amount);
			int qu1=statement.executeUpdate();
			System.out.println(qu1+ " row affected");
			
			
			
			
	}
	
	
	
	public static void deleteRecords() throws ClassNotFoundException, SQLException {
		
		
		System.out.println("\n Deleting the Record\n");
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the Customer name whose record is to be deleted");
				String name=s.next();
				
				
				Connection connection= DbUtility.getMyConnection();
					
					PreparedStatement statement=connection.prepareStatement("delete from hr.customer where customername=?");
				statement.setString(1, name);
					
					int qu2=statement.executeUpdate();
					System.out.println(qu2+ " row deleted");
					
					
					
					
			}
	
	
	
	
}
