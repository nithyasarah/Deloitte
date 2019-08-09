package com.deloitte.app;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.deloitte.model.Customer;
import com.deloitte.myappexceptions.*;
public class CustomerApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		try
		{
			Customer c=new Customer (1,"Banglore", "Nithya", 100);
			ObjectOutputStream s=new ObjectOutputStream(new BufferedOutputStream
					(new FileOutputStream(new File ("C:\\\\deloitte\\\\Batch\\\\BatchMates.txt"))));
			
			s.writeObject(c);
		System.out.println("successfull");
		s.close();
		}
		catch(InvalidCustomerIdException e)
		{
			System.out.println(e);
		
		}
		catch(NegativeBillAmountException e)
		{
			System.out.println(e);
		
		}

	}
	
	
	
	
}
