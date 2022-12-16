package com.keyword.thisKeyword;

public class TestParameter {
	
	int a, b;
	String c;
	public TestParameter() {
		// TODO Auto-generated constructor stub
		a = 100;
		b = 200;
		c = "Details";
	}
	
	void getDetails() {
		display(this);
	/*																									
	 * calling    display() function with 'this' as parameter 
	 * prints corresponding obj.a and obj.b values as given in the constructor
	 */
	}
	
	void display(TestParameter obj) {
		System.out.println("a = "+obj.a+", b= "+obj.b+", c = "+obj.c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestParameter tstpm = new TestParameter();
		tstpm.getDetails();
	}

}
