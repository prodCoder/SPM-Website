package test.mapper;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Teacher;
import com.example.entity.User;
import com.example.entity.UserInfo;
import com.example.mapper.TeacherMapper;
import com.example.mapper.UserInfoMapper;
import com.example.mapper.UserMapper;

public class TeacherMapperTest {
private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testInsertTeacher() throws Exception {
		Teacher teacher = new Teacher();
		teacher.setTeacherIndate("2015-04-01");
		teacher.setiD(311501);
		teacher.setTeacherDuty("教授");
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user=new User();
		user.setUserPassword("123456");
		user.setUserType(2);
		userMapper.insertUser(user);
		System.out.println(user.getiD());		
		UserInfoMapper infoMapper=(UserInfoMapper)applicationContext.getBean("userInfoMapper");
		UserInfo info=new UserInfo();
		info.setUser(user);
		info.setUserBirth("1978-12-26"); 
		info.setUserEmail("laozhou@qq.com");
		info.setUserName("老周");
		info.setUserSex("男");
		info.setUserTel("13666377422");
		infoMapper.insertUserInfo(info); 
		System.out.println(info.getiD());		
		teacher.setUserInfo(info);
		TeacherMapper teacherMapper=(TeacherMapper)applicationContext.getBean("teacherMapper");
		teacherMapper.insertTeacher(teacher);
	}

	@Test
	public void testDeleteTeacherById() throws Exception {
		TeacherMapper teacherMapper=(TeacherMapper)applicationContext.getBean("teacherMapper");
		teacherMapper.deleteTeacherById(311501);
	}

	@Test
	public void testUpdateTeacher() throws Exception {
		TeacherMapper teacherMapper=(TeacherMapper)applicationContext.getBean("teacherMapper");
		Teacher teacher = new Teacher();
		teacher.setTeacherIndate("2015-05-01");
		teacher.setiD(311503);
		teacher.setTeacherDuty("副教授");
		teacherMapper.updateTeacher(teacher);
	}

	@Test
	public void testFindTeacherById() throws Exception {
		TeacherMapper teacherMapper=(TeacherMapper)applicationContext.getBean("teacherMapper");
		Teacher teacher=teacherMapper.findTeacherById(311501);
		System.out.println(teacher);
	}
	
	public static void main(String args[]) throws Exception{
		TeacherMapperTest test=new TeacherMapperTest();
		test.setUp();
		test.testInsertTeacher();
//		test.testUpdateTeacher();
//		test.testDeleteTeacherById();
//		test.testFindTeacherById();
	}

}
