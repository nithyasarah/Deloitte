import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
Scanner s=new Scanner(System.in);
System.out.println("Please enter your option 1. print record 2.Insert record");
int o=s.nextInt();
if(o==1)
printRecords();
else
insertRecords();	
	
}


private static void printRecords() throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");	
	Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		System.out.println("Driver Loaded");
		
		Statement statement=connection.createStatement();
		ResultSet res=statement.executeQuery("select * from hr.stu");
		while (res.next())
		{System.out.print(res.getInt(1) + " ");
		System.out.println(res.getString(2));
	
		}
}
private static void insertRecords() throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");	
	Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		System.out.println("Driver Loaded");
		
		Statement statement=connection.createStatement();
		int r=statement.executeUpdate("insert into hr.stu values(1,'Veena')");
		System.out.println(r+" row affected");
}
		
	
}	
	
	

