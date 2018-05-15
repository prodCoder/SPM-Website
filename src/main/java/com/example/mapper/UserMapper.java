package com.example.mapper;

import com.example.entity.User;

public interface UserMapper {
	//����û�
    public void insertUser(User user) throws Exception;
    
    //�����û�
    public User findUserById(int id) throws Exception;
    
    //����idɾ���û�
    public void deleteUser(int id) throws Exception;
    
    //�����û�
    public void updateUser(User user) throws Exception;
    
    //�û�ͳ��
    public int findUserCountByType(int type) throws Exception;
}
