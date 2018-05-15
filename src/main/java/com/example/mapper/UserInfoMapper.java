
package com.example.mapper;

import java.util.List;

import com.example.entity.UserInfo;

public interface UserInfoMapper {

	//插入用户信息
	public void insertUserInfo(UserInfo info) throws Exception;
	
	//删除用户详细信息
	public void deleteUserInfoById(int id) throws Exception;

	//更新用户详细信息
	public void updateUserInfo(UserInfo info) throws Exception;
	
	//根据id查询用户详细信息
	public UserInfo findUserInfoById(int id) throws Exception;
	
	//条件查询用户详细信息:按名字模糊查询/按性别查询
	public List<UserInfo> findUserInfoByCondition(UserInfo info) throws Exception;
}
