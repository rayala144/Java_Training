package com.keyword.SuperKeyword;

class Super {
	
	int x = 10;
	String property = "Normal";
	
	public Super() {
		// TODO Auto-generated constructor stub
		System.out.println("Super class constructor is created");
	}
	
	void getData() {
		System.out.println("value is "+x+" and property is "+property);
	}
}

public class Test extends Super {
	
	public Test() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Test constructor is created lol");
	}
	
	public void display() {
		System.out.println("Display method is called");
		super.getData();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		obj.display();
	
	}

}
