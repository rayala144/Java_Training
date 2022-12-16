package com.javaAssignments;


public class IntReturnType {

	public static void main(String[] args) {

		IntReturnType obj = new IntReturnType();
		
		int x = obj.calculation();
		
		System.out.println(x);
	}

	public int calculation()
	{
		int a,b,c;
		a=360;
		b=4455;
		c=b-a;
		return c;
	}

}
