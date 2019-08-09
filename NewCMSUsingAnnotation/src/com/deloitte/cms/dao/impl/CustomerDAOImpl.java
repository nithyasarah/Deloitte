package com.deloitte.cms.dao.impl;

import java.lang.annotation.Annotation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;
import com.tombrus.javaParser.Token.Iterator;

public class CustomerDAOImpl implements CustomerDAO {
	AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
	SessionFactory factory=configuration.buildSessionFactory();
	Session session;
	

	
	@Override
	public List<Customer> getAllCustomers() {
	//	List<Customer> allCustomers = new ArrayList<Customer>();
		System.out.println(" ALL Customers \n");
		session=factory.openSession();
		
		//Query query=session.createQuery("from com.deloitte.cms.model.Customer");
		Criteria criteria=session.createCriteria(Customer.class);
		//criteria.add(Restrictions.like("customerAddress", "pala"));
		return criteria.list();
		
/*	java.util.Iterator<Customer> iterator= query.iterate();
	while(iterator.hasNext())
	{
        Customer customer=iterator.next();
        allCustomers.add(customer);
	}
			return allCustomers;*/
		
		//return query.list();
		}


	@Override
	public boolean insertCustomer(Customer customer) {
		session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(customer);
		transaction.commit();
			return true;
		

		
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		
		
		session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		
			return true;

	}
		
	

	@Override
	public Customer searchCustomerById(int customerId)
	{
		
		session=factory.openSession();
		Customer customer=new Customer();
		customer=(Customer) session.get(Customer.class, customerId);
		session.close();
		return customer;
	}
		
	

	@Override
	public boolean isCustomerExists(int customerId) {
		
		session=factory.openSession();
		Customer customer=new Customer();
		customer=(Customer) session.get(Customer.class, customerId);
		session.close();
		if(customer==null)
			return false;
		else
			return true;
		
	
	}

}
