package com.returnTypeExample;

public class IntReturnTypeExample {

	public static void main(String[] args) {

		IntReturnTypeExample obj = new IntReturnTypeExample();
		
		int x = obj.calculation();
		
		System.out.println(x);
	}

	public int calculation()
	{
		int a,b,c;
		a=30;
		b=45;
		c=a+b;
		return c;
	}

}
