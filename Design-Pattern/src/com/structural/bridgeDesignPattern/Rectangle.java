package com.structural.bridgeDesignPattern;

public class Rectangle extends Shape {
	
	
	public Rectangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String draw() {
		// TODO Auto-generated method stub
		return "Rectangle drawn " + color.fill();
	}



	
}
