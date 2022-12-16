package com.structural.bridgeDesignPattern;

public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}
	
	public abstract String draw();

}