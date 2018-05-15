package com.example.mapper;

import com.example.entity.Course;

public interface CourseMapper {

	
	public void insertCourse(Course course) throws Exception;
	
	public void deleteCourseById(int id) throws Exception;
	
	public void updateCourse(Course course) throws Exception;
	
	public Course findCourseById(int id) throws Exception;
}
