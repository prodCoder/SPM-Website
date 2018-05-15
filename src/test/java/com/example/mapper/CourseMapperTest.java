package test.mapper;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Course;
import com.example.entity.Teacher;
import com.example.mapper.CourseMapper;

public class CourseMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testInsertCourse() throws Exception {
		Course course=new Course();
		course.setCourseName("数据库概论和原理");
		course.setCourseIntroduction("数据库(Database)是按照数据结构来组织、存储和管理数据的仓库，它产生于距今六十多年前，"
				+ "随着信息技术和市场的发展，特别是二十世纪九十年代以后，数据管理不再仅仅是存储和管理数据，"
				+ "而转变成用户所需要的各种数据管理的方式。"
				+ "数据库有很多种类型，从最简单的存储有各种数据的表格到能够进行海量数据存储的大型数据库系统都在各个方面得到了广泛的应用。");
		Teacher teacher=new Teacher();
		teacher.setiD(311501);
		course.setTeacher(teacher);
		CourseMapper courseMapper=(CourseMapper)applicationContext.getBean("courseMapper");
		courseMapper.insertCourse(course);
	}
	

	@Test
	public void testUpdateCourse() throws Exception{
		Course course=new Course();
		course.setCourseName("");
		course.setiD(1);
		CourseMapper courseMapper=(CourseMapper)applicationContext.getBean("courseMapper");
		courseMapper.updateCourse(course);
	}

	@Test
	public void testDeleteCourseById() throws Exception {
		CourseMapper courseMapper=(CourseMapper)applicationContext.getBean("courseMapper");
		courseMapper.deleteCourseById(4);
	}

	@Test
	public void testFindCourseById() throws Exception{
		CourseMapper courseMapper=(CourseMapper)applicationContext.getBean("courseMapper");
		Course course=courseMapper.findCourseById(1);
		System.out.println(course);
	}
	
	public static void main(String args[]) throws Exception{
		CourseMapperTest test=new CourseMapperTest();
		test.setUp();
		test.testInsertCourse();
//		test.testUpdateCourse();
//		test.testDeleteCourseById();
//		test.testFindCourseById();
		
	}

}
