
package com.example.mapper;

import java.util.List;

import com.example.entity.UserInfo;

public interface UserInfoMapper {

	//�����û���Ϣ
	public void insertUserInfo(UserInfo info) throws Exception;
	
	//ɾ���û���ϸ��Ϣ
	public void deleteUserInfoById(int id) throws Exception;

	//�����û���ϸ��Ϣ
	public void updateUserInfo(UserInfo info) throws Exception;
	
	//����id��ѯ�û���ϸ��Ϣ
	public UserInfo findUserInfoById(int id) throws Exception;
	
	//������ѯ�û���ϸ��Ϣ:������ģ����ѯ/���Ա��ѯ
	public List<UserInfo> findUserInfoByCondition(UserInfo info) throws Exception;
}
