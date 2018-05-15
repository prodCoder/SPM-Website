package com.example.entity;
/***********************************************************************
 * Module:  Video.java
 * Author:  Administrator
 * Purpose: Defines the Class Video
 ***********************************************************************/

public class Video {
    private Integer id;
    private String videoAddress;
    private String videoTitle;
    private Exam exam;

    @Override
	public String toString() {
		
		return "["+id+","+videoAddress+","+videoTitle+","+exam+"]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoAddress() {
        return videoAddress;
    }

    public void setVideoAddress(String videoAddress) {
        this.videoAddress = videoAddress;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}