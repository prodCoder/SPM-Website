package com.example.mapper;

import com.example.entity.Teacher;

public interface TeacherMapper {
	
	//插入教师
	public void insertTeacher(Teacher teacher) throws Exception;
	
	//删除教师
	public void deleteTeacherById(int id) throws Exception;
	
	//更新教师信息
	public void updateTeacher(Teacher teacher) throws Exception;
	
	//根据id查找教师信息
	public Teacher findTeacherById(int id) throws Exception;

}
