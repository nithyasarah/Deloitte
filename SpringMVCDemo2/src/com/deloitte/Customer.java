package com.deloitte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Customer {
	@RequestMapping("/addcustomer")
	public String gg(){
		return "add";
	}
	@RequestMapping("/updatecustomer")
	public String uu(){
		return "update";
	}
	@RequestMapping("/deletecustomer")
	public String dd(){
		return "delete";
	}
	@RequestMapping("/findcustomer")
	public String ss(){
		return "search";
	}
	@RequestMapping("/findallcustomer")
	public String di(){
		return "display";
	}
	
	
}
