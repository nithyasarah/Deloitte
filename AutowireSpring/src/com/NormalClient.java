package com;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;

public class NormalClient {

	public static void main(String[] args) {
//
		Customer customer=new Customer(45,"Nithya", "kochi",9655);
		Address address=new Address(85,"Kuruppampady","kerala");
		customer.setAddress(address);
		System.out.println(customer);
		
		
		
		
	}

}
