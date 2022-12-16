package com.keyword.staticExample;

public class TestStaticBlock {
	
	static {
		System.out.println("Welcome to static block");
		
		int x = 134;
		int y = 212;
		int z = x*y;
		System.out.println("x+y = "+z);
	}
	
	public TestStaticBlock() {
		// TODO Auto-generated constructor stub
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestStaticBlock(); // object created
		System.out.println("This is main() method"); // main method executes

	}

}
