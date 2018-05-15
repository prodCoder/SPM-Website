package test.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Student;
import com.example.entity.User;
import com.example.entity.UserInfo;
import com.example.mapper.StudentMapper;
import com.example.mapper.UserInfoMapper;
import com.example.mapper.UserMapper;

public class StudentMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testInsertStudent() throws Exception {
		Student student = new Student();
		student.setStudentIndate("2015-09-01");
		student.setId(311502);		
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
		info.setUserEmail("lunlun@qq.com");
		info.setUserName("周杰伦");
		info.setUserSex("男");
		info.setUserTel("13666393315");
		infoMapper.insertUserInfo(info); 
		System.out.println(info.getiD());		
		student.setUserInfo(info);
		StudentMapper mapper=(StudentMapper)applicationContext.getBean("studentMapper");
		mapper.insertStudent(student);
	}

	@Test
	public void testDeleteStudentById() throws Exception {
		StudentMapper mapper=(StudentMapper)applicationContext.getBean("studentMapper");
		mapper.deleteStudentById(311501);
	}

	@Test
	public void testUpdateStudent() throws Exception {
		Student student=new Student();
		student.setId(311502);
		student.setStudentIndate("2015-09-01");
		StudentMapper mapper=(StudentMapper)applicationContext.getBean("studentMapper");
		mapper.updateStudent(student);
	}

	@Test
	public void testFindStudentById() throws Exception {
		StudentMapper mapper=(StudentMapper)applicationContext.getBean("studentMapper");
		Student student=mapper.findStudentById(311501);
		System.out.println(student);	  
	}
	
	public static void main(String args[]) throws Exception{
		StudentMapperTest test=new StudentMapperTest();
		test.setUp();
		test.testInsertStudent();
//		test.testDeleteStudentById();
//		test.testUpdateStudent();
//		test.testFindStudentById();
	}

}
