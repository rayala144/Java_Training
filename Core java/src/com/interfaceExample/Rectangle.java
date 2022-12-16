package com.interfaceExample;



public class Rectangle implements single {
	int l, b;
	
	public Rectangle(int length, int breadth) {
		// TODO Auto-generated constructor stub
		l = length;
		b = breadth;
	}

	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle with length = "+l+" and breadth = " +b+" is "+l*b);
	}

}
