package com.deloitte.model;
import java.io.Serializable;

import com.deloitte.myappexceptions.*;

public class Customer implements Serializable {
private int customerId;
private String customerAdress;
private String customerName;
private int billAmount;
public Customer() {
	super();
}


public Customer(int customerId, String customerAdress, String customerName, int billAmount) throws NegativeBillAmountException, InvalidCustomerIdException {
	super();
	if (customerId >0) 
	{
		this.customerId = customerId;
	}
	
	else
	{
		throw new InvalidCustomerIdException("Id cannot be negative");
	}
	this.customerAdress = customerAdress;

	
	this.customerName = customerName;
	if (billAmount>0) {
		this.billAmount = billAmount;
	}
	else
	{
		throw new NegativeBillAmountException("Bill cannot be negative");
	}
}



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + billAmount;
	result = prime * result + ((customerAdress == null) ? 0 : customerAdress.hashCode());
	result = prime * result + customerId;
	result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer other = (Customer) obj;
	if (billAmount != other.billAmount)
		return false;
	if (customerAdress == null) {
		if (other.customerAdress != null)
			return false;
	} else if (!customerAdress.equals(other.customerAdress))
		return false;
	if (customerId != other.customerId)
		return false;
	if (customerName == null) {
		if (other.customerName != null)
			return false;
	} else if (!customerName.equals(other.customerName))
		return false;
	return true;
}


@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerAdress=" + customerAdress + ", customerName="
			+ customerName + ", billAmount=" + billAmount + "]";
}


public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) throws InvalidCustomerIdException {
	if (customerId >0) 
	{
		this.customerId = customerId;
	}
	
	else
	{
		throw new InvalidCustomerIdException("Id cannot be negative");
	}}

public void setCustomerAdress(String customerAdress) {
	this.customerAdress = customerAdress;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getBillAmount() {
	return billAmount;
}
public void setBillAmount(int billAmount) throws NegativeBillAmountException {
	if (billAmount>0) 
	{
		this.billAmount = billAmount;
	}
	
	else
	{
		throw new NegativeBillAmountException("Bill cannot be negative");
	}
}	
	

}
