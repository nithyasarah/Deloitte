package com;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.deloitte.cms.model.Customer;

public class Client2 {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"beans.xml","second.xml"});
		Customer customer =(Customer)context.getBean("cust");
		Customer customer1 =(Customer)context.getBean("cust");
		System.out.println(customer);
		context.registerShutdownHook();
	
	
	
	
}
}
