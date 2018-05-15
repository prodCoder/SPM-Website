package test.mapper;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.Video;
import com.example.mapper.VideoMapper;


public class VideoMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}


	@Test
	public void testInsertVideo() throws Exception {
		VideoMapper videoMapper=(VideoMapper)applicationContext.getBean("videoMapper");
		Map<String, Object> map=new HashMap<String, Object>();
		Video video=new Video();
		video.setVideoAddress("/resourses/db5.mp4");
		video.setVideoTitle("关系数据库(一)");
		map.put("video", video);
		map.put("courseId", 1);
		videoMapper.insertVideo(map);
		System.out.println(video.getId());
	}

	@Test
	public void testDeleteVideoById() throws Exception {
		VideoMapper videoMapper=(VideoMapper)applicationContext.getBean("videoMapper");
		videoMapper.deleteVideoById(5);
	}

	@Test
	public void testUpdateVideo() throws Exception{
		Video video=new Video();
		video.setId(4);
		video.setVideoAddress("/resourses/dbms4.mp4");
		video.setVideoTitle("数据库管理系统(一)");
		VideoMapper videoMapper=(VideoMapper)applicationContext.getBean("videoMapper");
		videoMapper.updateVideo(video);
	}

	@Test
	public void testFindVideoById() throws Exception{
		VideoMapper videoMapper=(VideoMapper)applicationContext.getBean("videoMapper");
		Video video=videoMapper.findVideoById(1);
		System.out.println(video);
	}

	@Test
	public void testFindVideoPageByCourseId() throws Exception{
		VideoMapper videoMapper=(VideoMapper)applicationContext.getBean("videoMapper");
		List<Video> list=videoMapper.findVideoPageByCourseId(5);
		System.out.println(list);
	}
	
	public static void main(String args[])throws Exception{
		VideoMapperTest test=new VideoMapperTest();
		test.setUp();
//		test.testInsertVideo();
//		test.testDeleteVideoById();
//		test.testUpdateVideo();
//		test.testFindVideoById();
		test.testFindVideoPageByCourseId();
	}

}
