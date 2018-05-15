package test.mapper;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.ChooseCourse;
import com.example.entity.Course;
import com.example.entity.Student;
import com.example.mapper.ChooseCourseMapper;

public class ChooseCourseMapperTest {
private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
	}

	@Test
	public void testInsertChooseCourse() throws Exception {
		Course course =new Course();
		course.setiD(1);
		Student student=new Student();
		student.setId(311502);
		ChooseCourse chooseCourse=new ChooseCourse();
		chooseCourse.setCourse(course);
		chooseCourse.setStudent(student);
		
		ChooseCourseMapper chooseCourseMapper=(ChooseCourseMapper)applicationContext.getBean("chooseCourseMapper");
		chooseCourseMapper.insertChooseCourse(chooseCourse);
	}

	@Test
	public void testDeleteChooseCourseById() {
		
	}

	@Test
	public void testFindChooseCourseListByStudentId() throws Exception {
		ChooseCourseMapper chooseCourseMapper=(ChooseCourseMapper)applicationContext.getBean("chooseCourseMapper");
		List<ChooseCourse> list=chooseCourseMapper.findChooseCourseListByStudentId(311501);
		System.out.println(list);
	}
	
	public static void main(String args[]) throws Exception {
		ChooseCourseMapperTest test=new ChooseCourseMapperTest();
		test.setUp();
		test.testInsertChooseCourse();
//		test.testFindChooseCourseListByStudentId();
	}

}
