package com.deloitte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class My {
	@RequestMapping("/Apple")
	public String gg(){
		return "ball";
	}
	
	@RequestMapping("/dosome")
	public ModelAndView hh(){
		
		ModelAndView view=new ModelAndView();
		view.addObject("message","Hello, today is thursday");
		view.setViewName("say");
		
		return view;
	}
	
	
}
