package com.sterlite.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sterlite.springrest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {
	
	
	List<Course> list;
	
	public CourseServiceimpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"java","jav COURSE"));
		list.add(new Course(148,"big data","big data"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

}
