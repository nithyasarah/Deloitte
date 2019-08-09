package comm.utlity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {
	public static Connection getMyConnection()
	{
	
	Connection connection=null;
	FileReader reader=null;
	Properties properties=new Properties();
	try {
		reader = new FileReader("C:\\deloitte\\mydatabase.properties");
		
			properties.load(reader);
	}
	
	catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	String driver=properties.getProperty("driver");
	String url=properties.getProperty("url");
	String username=properties.getProperty("username");
	String password=properties.getProperty("password");
		try {
				Class.forName(driver);	
				connection=DriverManager.getConnection(url,username, password);
			}
		
		catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
		return connection;	
	
	}
	
	
	
}
