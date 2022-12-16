package com.interfaceExample;
import java.util.*;


interface input{
	void read();
}

interface measure extends input{
	void area();
}

class Gradient implements measure{
	int l,b;
	
	public Gradient() {
		l = 0;
		b = 0;
	}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		l = sc.nextInt();
		System.out.println("Enter breadth: ");
		b = sc.nextInt();
		sc.close();
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area is :"+l*b);
	}
	
}

public class TestExtendingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gradient gt = new Gradient();
		gt.read();
		gt.area();
	}

}
