package com.keyword.thisKeyword;

public class TestMethod {

	void display() {
		this.show(); // calling show() method which is present in the same class using this keyword
	}
	
	void show() {
		System.out.println("This is show method");
	}
	
	public static void main(String[] args) {
		TestMethod obj = new TestMethod();
		obj.display();
	}
	
}
