package com.interfaceExample;
import java.util.Scanner;

public class TestSingleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter square side: ");
		Square sq = new Square(sc.nextInt());
		// sq.read();
		sq.area();
		
		System.out.println("Enter rectangle length: ");
		System.out.println("Enter rectangle breadth: ");
		Rectangle rct = new Rectangle(sc.nextInt(), sc.nextInt());
		// rct.read();
		rct.area();
	}

}
