package com.javaAssignments;

public class DoubleReturnType {

	public static void main(String[] args) {

		DoubleReturnType obj = new DoubleReturnType();
		
		double x = obj.calc();
		
		System.out.println(x);
	}

	public double calc()
	{
		double a,b,c;
		a=30.74584d;
		b=45.766587d;
		c=a+b;
		return c;
	}

}
