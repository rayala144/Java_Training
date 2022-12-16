package com.structural.bridgeDesignPattern;

public class TestBridgeDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Square(new Red());
		String redSquare = shape.draw();
		System.out.println(redSquare);
		
		
		System.out.println("--------------------");
		
		Shape shape2 = new Rectangle(new Blue());
		String blueRectangle = shape2.draw();
		System.out.println(blueRectangle);
	}

}
