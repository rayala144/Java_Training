package com.structural.decoratorDesignPattern;

public class SportsBike extends DecoratorBike {

	public SportsBike(Bike bike) {
		// TODO Auto-generated constructor stub
		super(bike);
	}
	
	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding sports features to your bike...");
	}
	
	
}
