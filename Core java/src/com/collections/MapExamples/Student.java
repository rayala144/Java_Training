package com.collections.MapExamples;

public class Student {
	int StuID;
	String stuName;
	char stuGrade;
	
	public Student(int stuID, String stuName, char stuGrade) {
		super();
		StuID = stuID;
		this.stuName = stuName;
		this.stuGrade = stuGrade;
	}

	@Override
	public String toString() {
		return "Student [StuID=" + StuID + ", stuName=" + stuName + ", stuAge=" + stuGrade + "]";
	}
	
	
}
