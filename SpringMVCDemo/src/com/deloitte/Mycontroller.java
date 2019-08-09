package com.deloitte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {

	@RequestMapping("/Neha")
	public String gg(){
		return "Kalpana";
	}
	
	@RequestMapping("/Karan")
	public String gaag(){
		return "Karthik";
	}
}
