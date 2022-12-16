package com.returnTypeExample;

public class DoubleReturnTypeExample {

	public static void main(String[] args) {

		DoubleReturnTypeExample obj = new DoubleReturnTypeExample();
		
		double x = obj.calculation();
		
		System.out.println(x);
	}

	public double calculation()
	{
		double a,b,c;
		a=30;
		b=45;
		c=a+b;
		return c;
	}

}
