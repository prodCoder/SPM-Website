package com.example.mapper;

import com.example.entity.Student;

public interface StudentMapper {
	
	//插入学生
	public void insertStudent(Student student) throws Exception;
	
	//删除学生记录
	public void deleteStudentById(int id) throws Exception;
	
	//修改学生信息
	public void updateStudent(Student student) throws Exception;
		
	//查找学生信息
	public Student findStudentById(int id) throws Exception;
}
