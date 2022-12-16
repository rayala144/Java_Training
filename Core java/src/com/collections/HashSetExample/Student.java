package com.collections.HashSetExample;

public class Student {
	
	int stuID;
	String name;
	int stuAge;
	
	public Student(int stuID, String name, int stuAge) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.stuAge = stuAge;
	}

	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", name=" + name + ", stuAge=" + stuAge + "]";
	}




}
