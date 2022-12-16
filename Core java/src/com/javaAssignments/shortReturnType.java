package com.javaAssignments;

public class shortReturnType {

	public static void main(String[] args) {

		shortReturnType obj = new shortReturnType();
		
		short x = obj.calc();
		
		System.out.println(x);
	}

	public short calc()
	{
		short a,b,c;
		a=8;
		b=9;
		c=(short) (a+b);
		return c;
	}

}
