package comm.client;


import java.util.Scanner;

import comm.Employee;
import comm.dao.EmployeeDAO;
import comm.dao.impl.EmployeeDAOImpl;



public class EmployeeClient {

	public static void main(String[] args) 
	
	{
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		System.out.println("Fill up \n ");
		Scanner scanner = new Scanner(System.in);
		int id=0;
				//System.out.println("Enter employee id ");
				//String Empid = scanner.next();
                  System.out.println("Enter employee first name ");
					String Fname= scanner.next();
					  System.out.println("Enter employee last name ");
						String LastName = scanner.next();
					System.out.println("Enter employee address ");
					String Address = scanner.next();
					System.out.println("Enter dob");
					String Dob = scanner.next();
					String f= Fname.substring(0,2);
					String l= LastName.substring(0,2);
					id++;
					String Empid=f+l+ Integer.toString(id);
					Employee employee = new Employee(Fname, LastName, Empid, Address, Dob);
					employeeDAO.insertEmployee(employee);
					System.out.println(Fname +"  " +LastName+ " congrats !! Enjoy Your Data is entered");
			
	
	
	}
			}
	
	