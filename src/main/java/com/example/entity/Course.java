package com.example.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/***********************************************************************
 * Module:  Course.java
 * Author:  Administrator
 * Purpose: Defines the Class Course
 ***********************************************************************/

public class Course {
    private Integer iD;
    private String courseName;
    private String courseIntroduction;
    private Collection<Video> video;
    private Teacher teacher;


    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "["+iD+","+courseName+","+courseIntroduction+","+video+"teacher"+"]";
	}

	public Collection<Video> getVideo() {
        if (video == null)
            video = new HashSet<Video>();
        return video;
    }

    public Iterator getIteratorVideo() {
        if (video == null)
            video = new HashSet<Video>();
        return video.iterator();
    }

    /**
     * @param newVideo
     * @pdGenerated default setter
     */
    public void setVideo(Collection<Video> newVideo) {
        removeAllVideo();
        for (Iterator iter = newVideo.iterator(); iter.hasNext(); )
            addVideo((Video) iter.next());
    }

    /**
     * @param newVideo
     * @pdGenerated default add
     */
    public void addVideo(Video newVideo) {
        if (newVideo == null)
            return;
        if (this.video == null)
            this.video = new HashSet<Video>();
        if (!this.video.contains(newVideo)) {
            this.video.add(newVideo);
        }
    }

    /**
     * @param oldVideo
     * @pdGenerated default remove
     */
    public void removeVideo(Video oldVideo) {
        if (oldVideo == null)
            return;
        if (this.video != null)
            if (this.video.contains(oldVideo)) {
                this.video.remove(oldVideo);
            }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllVideo() {
        if (video != null) {
            Video oldVideo;
            for (Iterator iter = getIteratorVideo(); iter.hasNext(); ) {
                oldVideo = (Video) iter.next();
                iter.remove();
            }
        }
    }

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}