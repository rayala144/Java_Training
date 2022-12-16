package com.oopsExample;

public class Student {

	private String stuName;
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	private int stuAge;
	private int stuID;
	@Override
	public String toString() {
		return "Student_details:  [Name=" + stuName + ", Age=" + stuAge + ", ID=" + stuID + "]";
	}
	
	

}
