package com.structural.decoratorDesignPattern;

public class TestDecoratorDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Assembling basic bike first---------");
		Bike basicBike = new BasicBike();
		basicBike.assembleBike();
		
		System.out.println("-------Decorating basic bike with sports features------");
		Bike luxuryBike = new LuxuryBike(basicBike);
		luxuryBike.assembleBike();
		
		System.out.println("-------Decorating basic bike with sports features------");
		Bike sportsBike = new SportsBike(basicBike);
		sportsBike.assembleBike();
		

	}

}
