package com.ExceptionHandling;


class Akhil extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

class Triangle{
	int b, h;

	public Triangle(int b, int h) {
		super();
		this.b = b;
		this.h = h;
	}
	
	public void area() throws Akhil {
		if(b <= 0 || h <= 0)  {
			throw new Akhil();
		}
		else System.out.println("Area is: "+0.5*b*h);
	}
	
	
}


public class TestUser {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle(-2, 12);
		try {
			obj.area();
		} catch (Akhil e) {
			// TODO: handle exception
			System.err.println("Cannot multiply");
		}

	}

}
