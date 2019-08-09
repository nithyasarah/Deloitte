package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {

	private static final String SELECT_CUSTOMER_QUERY="select * from hr.customer where customerid=?";
	private static final String INSERT_CUSTOMER_QUERY="insert into hr.customer values(?,?,?,?)";
	private static final String UPDATE_CUSTOMER_QUERY="update hr.customer set customeraddress=? ,customername=?, billamount=? where customerId=?";
	private static final String DELETE_CUSTOMER_QUERY="delete from hr.customer where customerid=?";
	private static final String GET_ALL_CUSTOMER_QUERY="select * from hr.customer";

	
	@Override
	public List<Customer> getAllCustomers() {
Connection connection = DbUtility.getMyConnection();
			boolean isUserExists = false;
			
			List<Customer> allCustomers = new ArrayList<Customer>();

			try {
				PreparedStatement statement = connection.prepareStatement(GET_ALL_CUSTOMER_QUERY);

				ResultSet resultSet = statement.executeQuery();
				while (resultSet.next()) {
					Customer customer = new Customer();
					customer.setCustomerId(resultSet.getInt(1));
					customer.setCustomerName(resultSet.getString(2));
					customer.setCustomerAddress(resultSet.getString(3));
					customer.setBillAmount(resultSet.getInt(4));
					allCustomers.add(customer);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return allCustomers;
		}


	@Override
	public boolean insertCustomer(Customer customer) {
		Connection connection=DbUtility.getMyConnection();
	int qu1=0;
	
	try {
		PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
		statement.setInt(1, customer.getCustomerId());
		statement.setString(2, customer.getCustomerName());
		statement.setString(3, customer.getCustomerAddress());
		statement.setInt(4, customer.getBillAmount());
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

	@Override
	public boolean updateCustomer(Customer customer) {

		Connection connection=DbUtility.getMyConnection();
		int qu2=0;
		
		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_QUERY);
			statement.setInt(4, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setString(1, customer.getCustomerAddress());
			statement.setInt(3, customer.getBillAmount());
			qu2=statement.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(qu2==0)
			return false;
			else		
			return true;
		

		
	}

	@Override
	public boolean deleteCustomer(int customerId) {

		Connection connection = DbUtility.getMyConnection();
		int rows = 0;
		try {
			PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1, customerId);

			rows = statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rows == 0)
			return false;
		else
			return true;

	}
		
	

	@Override
	public Customer searchCustomerById(int customerId)
	{
		Connection connection=DbUtility.getMyConnection();
		Customer customer=new Customer();
		try {
			PreparedStatement statement=connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1,customerId);
			ResultSet resultset=statement.executeQuery();
			resultset.next();
			customer.setCustomerId(resultset.getInt(1));
			customer.setCustomerName(resultset.getString(2));
			customer.setCustomerAddress(resultset.getString(3));
			customer.setBillAmount(resultset.getInt(4));
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
	}
		
	

	@Override
	public boolean isCustomerExists(int customerId) {
		Connection connection=DbUtility.getMyConnection();
		boolean isUserExists=false;
		try {
			PreparedStatement statement=connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1,customerId);
			ResultSet resultset=statement.executeQuery();
			if(resultset.next())
			{
				isUserExists=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUserExists;
	}

}
