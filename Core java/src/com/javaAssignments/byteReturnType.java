package com.javaAssignments;

public class byteReturnType {

	public static void main(String[] args) {

		byteReturnType obj = new byteReturnType();
		
		byte x = obj.calc();
		
		System.out.println(x);
	}

	public byte calc()
	{
		byte a,b,c;
		a=20;
		b=5;
		c=(byte)(a-b);
		return c;
	}

}
