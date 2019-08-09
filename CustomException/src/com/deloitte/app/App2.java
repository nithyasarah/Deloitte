package com.deloitte.app;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.deloitte.model.Customer;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.NegativeBillAmountException;

public class App2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try
		{
			Customer c=new Customer ();
			ObjectInputStream s=new ObjectInputStream(new BufferedInputStream
					(new FileInputStream(new File ("C:\\\\deloitte\\\\Batch\\\\BatchMates.txt"))));
			
			c=(Customer)s.readObject();
			System.out.println(c);
		s.close();
		}
		catch(InvalidCustomerIdException e)
		{
			System.out.println(e);
		
		}
		

}
}

