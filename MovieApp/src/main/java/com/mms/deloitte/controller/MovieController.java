package com.mms.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.deloitte.dao.MovieDAO;
import com.mms.deloitte.model.Movie;


@RestController
public class MovieController {

	
	@Autowired
     MovieDAO movieDAO;
	
	
	@RequestMapping("/getMovie")
	public String getProduct()
	{
		return "getting Movie";
	}

	@RequestMapping("/saveMovie")
	public String saveProduct()
	{
		Movie movie=new Movie(115, "Sherlock", "Ritchie", 96000);
	movieDAO.save(movie);
		return "Movie inserted Successfully";
	}
}
