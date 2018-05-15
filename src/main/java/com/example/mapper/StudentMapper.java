package com.example.mapper;

import com.example.entity.Student;

public interface StudentMapper {
	
	//����ѧ��
	public void insertStudent(Student student) throws Exception;
	
	//ɾ��ѧ����¼
	public void deleteStudentById(int id) throws Exception;
	
	//�޸�ѧ����Ϣ
	public void updateStudent(Student student) throws Exception;
		
	//����ѧ����Ϣ
	public Student findStudentById(int id) throws Exception;
}
