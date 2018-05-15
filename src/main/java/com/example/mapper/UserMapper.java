package com.example.mapper;

import com.example.entity.User;

public interface UserMapper {
	//添加用户
    public void insertUser(User user) throws Exception;
    
    //查找用户
    public User findUserById(int id) throws Exception;
    
    //根据id删除用户
    public void deleteUser(int id) throws Exception;
    
    //更新用户
    public void updateUser(User user) throws Exception;
    
    //用户统计
    public int findUserCountByType(int type) throws Exception;
}
