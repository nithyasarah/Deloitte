package com.deloitte.myappexceptions;

public class InvalidCustomerIdException extends RuntimeException {

	
	public InvalidCustomerIdException()
	{
		
	}
	public InvalidCustomerIdException(String message) 
	{
		super(message);
	}
}
