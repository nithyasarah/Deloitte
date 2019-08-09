package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;

public class Client {

	public static void main(String[] args) {
	
		Configuration configuration=new Configuration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		PremiumCustomer customer= new PremiumCustomer(1,"Akshay", "Jaipur",56);
		customer.setRewardPoints(75);
		//Customer customer=new Customer(56,"thomas","LA",8522);
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println(customer.getCustomerName()+"  your file is saved");
		
		
		
	}
	
	
}
