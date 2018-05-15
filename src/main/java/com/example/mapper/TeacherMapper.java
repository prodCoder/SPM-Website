package com.example.mapper;

import com.example.entity.Teacher;

public interface TeacherMapper {
	
	//�����ʦ
	public void insertTeacher(Teacher teacher) throws Exception;
	
	//ɾ����ʦ
	public void deleteTeacherById(int id) throws Exception;
	
	//���½�ʦ��Ϣ
	public void updateTeacher(Teacher teacher) throws Exception;
	
	//����id���ҽ�ʦ��Ϣ
	public Teacher findTeacherById(int id) throws Exception;

}
