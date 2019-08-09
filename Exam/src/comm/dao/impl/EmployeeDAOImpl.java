package comm.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import comm.Employee;
import comm.dao.EmployeeDAO;
import comm.utlity.DbUtility;

public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String INSERT_EMPLOYEE_QUERY="insert into hr.employee2 values(?,?,?,?,?)";
	
	@Override
	public boolean insertEmployee(Employee employee) {
		Connection connection=DbUtility.getMyConnection();
	int qu1=0;
	
	try {
		PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEE_QUERY);
		statement.setString(1, employee.getFname());
		statement.setString(2, employee.getLastName());
		statement.setString(3, employee.getEmpid());
		statement.setString(4, employee.getDob());
		statement.setString(5, employee.getAddress());
		qu1=statement.executeUpdate();
		
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(qu1==0)
		return false;
		else		
		return true;
	}

	
	
	

}
