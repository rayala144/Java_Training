package com.structural.decoratorDesignPattern;

public class DecoratorBike implements Bike {

	protected Bike bike;
	
	public DecoratorBike(Bike bike) {
		// TODO Auto-generated constructor stub
		this.bike = bike;
	}

	@Override
	public void assembleBike() {
		// TODO Auto-generated method stub
		bike.assembleBike();
		
	}

	
	
}
