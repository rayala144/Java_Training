package com.javaAssignments;

public class FloatReturnType {

	public static void main(String[] args) {

		FloatReturnType obj = new FloatReturnType();
		
		float x = obj.calc();
		
		System.out.println(x);
	}

	public float calc()
	{
		float a,b,c;
		a=87.665f;
		b=45.75f;
		c=a+b;
		return c;
	}

}
