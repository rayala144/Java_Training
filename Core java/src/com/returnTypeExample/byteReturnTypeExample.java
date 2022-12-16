package com.returnTypeExample;

public class byteReturnTypeExample {

	public static void main(String[] args) {

		byteReturnTypeExample obj = new byteReturnTypeExample();
		
		byte x = obj.calculation();
		
		System.out.println(x);
	}

	public byte calculation()
	{
		byte a,b,c;
		a=30;
		b=45;
		c=(byte)(a+b);
		return c;
	}

}
