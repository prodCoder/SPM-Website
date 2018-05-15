package test.mapper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.User;
import com.example.entity.UserInfo;
import com.example.mapper.UserInfoMapper;
import com.example.mapper.UserMapper;

public class UserInfoMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testInsertUserInfo() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user=new User();
		user.setUserPassword("123456");
		user.setUserType(1);
		userMapper.insertUser(user);
		System.out.println(user.getiD());		
		UserInfoMapper infoMapper=(UserInfoMapper)applicationContext.getBean("userInfoMapper");
		UserInfo info=new UserInfo();
		info.setUser(user);
		info.setUserBirth("1999-12-26");
		info.setUserEmail("xiaofangfang@qq.com");
		info.setUserName("С����");
		info.setUserSex("Ů");
		info.setUserTel("13666395248");
		infoMapper.insertUserInfo(info);
		System.out.println(info.getiD());
	}
	
	//ɾ���û���Ϣ����
	@Test
	public void testDeleteUserInfoById() throws Exception {
		UserInfoMapper infoMapper=(UserInfoMapper)applicationContext.getBean("userInfoMapper");
		infoMapper.deleteUserInfoById(11);		
	}
	
	//�����û���ϸ��Ϣ
	@Test
	public void testUpdateUserInfo() throws Exception {
		UserInfoMapper infoMapper=(UserInfoMapper)applicationContext.getBean("userInfoMapper");
		UserInfo info=new UserInfo();
//		User user=new User();
//		user.setiD(1);
		//info.setUser(user);
		info.setiD(10);
//		info.setUserBirth("1980-01-01");
		info.setUserEmail("shengdan@qq.com");
//		info.setUserName("��³�");
//		info.setUserSex("��");
		info.setUserTel("13325856996");
		infoMapper.updateUserInfo(info);
	}
	
	//����id��ѯ�û���ϸ��Ϣ
	@Test
	public void testFindUserInfoById() throws Exception {
		UserInfoMapper infoMapper=(UserInfoMapper)applicationContext.getBean("userInfoMapper");
		UserInfo info=infoMapper.findUserInfoById(10);
	System.out.println(info);	
	}
	
	//������ѯ�û���ϸ��Ϣ:������ģ����ѯ/���Ա��ѯ
	@Test
	public void testFindUserInfoByCondition() throws Exception {
		UserInfoMapper infoMapper=(UserInfoMapper)applicationContext.getBean("userInfoMapper");
		UserInfo info=new UserInfo();
		info.setUserName("С");
		info.setUserSex("Ů");
		List<UserInfo> list=infoMapper.findUserInfoByCondition(info);
		System.out.println(list);
	}
	
}
