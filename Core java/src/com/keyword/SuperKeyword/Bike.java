package com.keyword.SuperKeyword;


class Vehicle {
	public Vehicle() {
		// TODO Auto-generated constructor stub
		System.out.println("Vehicle is started");
	}
}

public class Bike extends Vehicle {
	
	public Bike() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Bike is started");		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Bike();
	}

}
