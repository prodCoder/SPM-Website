package com.example.mapper;

import java.util.List;
import java.util.Map;

import com.example.entity.Video;

public interface VideoMapper {

	public void insertVideo(Map map) throws Exception;
	
	public void deleteVideoById(int id) throws Exception;
	
	public void updateVideo(Video video) throws Exception;
	
	public Video findVideoById(int id) throws Exception;

	public List<Video> findVideoPageByCourseId(int id) throws Exception;
}
