package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;

public class Client {

	public static void main(String[] args) {
		//Customer customer=new Customer(123,"preeti","delhi",8500);
		
		Configuration configuration=new Configuration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Customer customer= (Customer) session.get(Customer.class,124);
		System.out.println(customer);
		//customer.setCustomerName("Giri");
		//customer.setCustomerAddress("Kolkata");
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println(customer.getCustomerName()+"  your file is saved");
		
		
		
	}
	
	
}
