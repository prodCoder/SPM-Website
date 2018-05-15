package com.example.mapper;

import java.util.List;

import com.example.entity.ChooseCourse;

public interface ChooseCourseMapper {

	
	public void insertChooseCourse(ChooseCourse chooseCourse) throws Exception;
	
	public void deleteChooseCourseById(int id) throws Exception;
	
	public List<ChooseCourse> findChooseCourseListByStudentId(int id) throws Exception;
}
