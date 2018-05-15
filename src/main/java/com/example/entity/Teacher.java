package com.example.entity;
/***********************************************************************
 * Module:  Teacher.java
 * Author:  Administrator
 * Purpose: Defines the Class Teacher
 ***********************************************************************/

public class Teacher {
    private Integer iD;
    private String teacherIndate;
    private String teacherDuty;
    private UserInfo userInfo;

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getTeacherIndate() {
        return teacherIndate;
    }

    public void setTeacherIndate(String teacherIndate) {
        this.teacherIndate = teacherIndate;
    }

    public String getTeacherDuty() {
        return teacherDuty;
    }

    public void setTeacherDuty(String teacherDuty) {
        this.teacherDuty = teacherDuty;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }
    
    @Override
	public String toString() {
		return "["+iD+","+teacherIndate+","+userInfo+"]";
	}
}


