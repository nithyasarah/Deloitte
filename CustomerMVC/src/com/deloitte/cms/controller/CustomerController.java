package com.deloitte.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;

@Controller
public class CustomerController {
	//@Autowired
	//CustomerDAO customerDAO;
	@Autowired
	CustomerService customerService; 
	
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer)
	{
		//CustomerDAO customerDAO= new CustomerDAOImpl();
		customerService.insertCustomer(customer);
		return new ModelAndView("success", "a", customer);
		
		
	}
	

	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer)
	{
		//CustomerDAO customerDAO= new CustomerDAOImpl();
		customerService.updateCustomer(customer);
		return new ModelAndView("success", "a", customer);
		
		
	}
	
	@RequestMapping("/Customerbyidform")
	public ModelAndView Customerbyid(Customer customer)
	{
		
		return new ModelAndView("Customerbyid","command", new Customer());
		
		
	}
	

	@RequestMapping("/searchCustomerById")
	public ModelAndView searchCustomerById(Customer customer)
	{
		Customer customer2= new Customer();
		customer2=customerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView("Customerbyid","command", customer2);
		
		
	}
	
	
}
