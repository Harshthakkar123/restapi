package com.sterlite.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.sterlite.springrest.entities.Course;
import com.sterlite.springrest.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService  courseservice;
	
	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		
		return this.courseservice.getCourses();
		
		
	}
	
	
	
	
	

}
