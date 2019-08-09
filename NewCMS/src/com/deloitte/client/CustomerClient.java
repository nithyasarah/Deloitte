package com.deloitte.client;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

public class CustomerClient {

	public static void main(String[] args) {
		
		//Search
		int customerId=100;
		CustomerDAO customerDAO=new CustomerDAOImpl();
		boolean result= customerDAO.isCustomerExists(customerId);
		System.out.println(result);
//Insert		
Customer customer =new Customer(123,"isha","Patna", 1200);
boolean resultInsert=customerDAO.insertCustomer(customer);
System.out.println(resultInsert);

//Update
Customer customer1 =new Customer();
customer1.setCustomerId(2);
customer1.setCustomerAddress("Punjab");
customer1.setBillAmount(6200);
customer1.setCustomerName("leela");
boolean resultUpdate=customerDAO.updateCustomer(customer1);
System.out.println(resultUpdate);

//SearchbyId
int customerId1=200;
Customer c3=customerDAO.searchCustomerById(customerId1);
System.out.println(c3);
	}

}
