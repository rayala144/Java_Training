package com.keyword.finalExample;

class Student {
	final void sciencePaper() {
		System.out.println("Your research papers are verified");
	}
}

public class Teacher extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.sciencePaper();
	}

}
