package com.example.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.User;
import com.example.mapper.UserMapper;

public class UserMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	//�����û�
	@Test
	public void testInsertUser() throws Exception {
		User user=new User();
        user.setUserPassword("111222");
        user.setUserType(2);
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        userMapper.insertUser(user);
        System.out.println(user.getiD());
	}
	
	//ɾ���û�
	@Test
	public void testDeleteUser() throws Exception {
		UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		userMapper.deleteUser(4);
	
	}
	
	//�����û�
	
	@Test
	public void testUpdateUser() throws Exception {
		User user=new User();
		user.setiD(2);
        user.setUserPassword("16");
        user.setUserType(2);	
        UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
        userMapper.updateUser(user);
						
	}
	
	//�����û�
	public void testFindUserById() throws  Exception {
		UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserById(4);
		System.out.println(user);
	}
	
	
	//�û�ͳ��
	public void testfindUserCountByType() throws  Exception {
		UserMapper userMapper=(UserMapper) applicationContext.getBean("userMapper");
		int count=userMapper.findUserCountByType(1);
		System.out.println(count);
	}
	
	
	public static void main(String args[]) throws Exception {
        UserMapperTest test=new UserMapperTest();
        test.setUp();
//        test.testInsertUser();
//        test.testDeleteUser();
//        test.testUpdateUser();
        test.testFindUserById();
        test.testfindUserCountByType();
	}

}
