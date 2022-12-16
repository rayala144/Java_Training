package com.returnTypeExample;

public class FloatReturnTypeExample {

	public static void main(String[] args) {

		FloatReturnTypeExample obj = new FloatReturnTypeExample();
		
		float x = obj.calculation();
		
		System.out.println(x);
	}

	public float calculation()
	{
		float a,b,c;
		a=30;
		b=45;
		c=a+b;
		return c;
	}

}
