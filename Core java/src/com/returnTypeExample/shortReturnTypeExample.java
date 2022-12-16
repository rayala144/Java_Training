package com.returnTypeExample;

public class shortReturnTypeExample {

	public static void main(String[] args) {

		shortReturnTypeExample obj = new shortReturnTypeExample();
		
		short x = obj.calculation();
		
		System.out.println(x);
	}

	public short calculation()
	{
		short a,b,c;
		a=30;
		b=45;
		c=(short) (a+b);
		return c;
	}

}
