package com.example.entity;
/***********************************************************************
 * Module:  Student.java
 * Author:  Administrator
 * Purpose: Defines the Class Student
 ***********************************************************************/

public class Student {
    private Integer id;
    private String studentIndate;
    private UserInfo userInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentIndate() {
        return studentIndate;
    }

    public void setStudentIndate(String studentIndate) {
        this.studentIndate = studentIndate;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

	@Override
	public String toString() {
		return "["+id+","+studentIndate+","+userInfo+"]";
	}
    
    
}