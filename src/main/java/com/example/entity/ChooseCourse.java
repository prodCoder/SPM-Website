package com.example.entity;


public class ChooseCourse {
    private Integer iD;
    private Course course;
    private Student student;

    @Override
	public String toString() {
		
		return "["+iD+","+course+","+student+"]";
	}

	public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}