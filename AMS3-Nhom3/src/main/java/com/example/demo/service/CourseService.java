package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
@Service
public class CourseService {

	private List<Course> listCourse = new ArrayList<>();
	public void add(Course newProduct) {
		listCourse.add(newProduct);
	}
	public List<Course> GetAll(){
		return listCourse;
	}
}
