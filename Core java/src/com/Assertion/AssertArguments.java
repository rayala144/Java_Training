package com.Assertion;

public class AssertArguments {
	
	String type;
	int price;
	int mileage;
	int maxSpeed;
	char category;
	
	public AssertArguments(String type, int price, int mileage, int maxSpeed, char category) {
		super();
		this.type = type;
		this.price = price;
		this.mileage = mileage;
		this.maxSpeed = maxSpeed;
		this.category = category;
	}
	
	{
	assert(price > 0):"Price can't be zero";
	assert(mileage > 10):"Mileage can't be less than 10";
	assert(maxSpeed >= 50):"Max speed should atleast be 20 kmph";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
