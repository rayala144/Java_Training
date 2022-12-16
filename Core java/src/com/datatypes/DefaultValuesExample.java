package com.datatypes;

public class DefaultValuesExample {
	
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char ch;
	static boolean boo;
	int a;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Byte default value is:\t\t"+b);
		System.out.println("Short default value is:\t\t"+s);
		System.out.println("Integer default value is:\t"+i);
		System.out.println("Long default value is:\t\t"+l);
		System.out.println("Float default value is:\t\t"+f);
		System.out.println("Double default value is:\t"+d);
		System.out.println("Char default value is:\t\t"+(int)ch);
		System.out.println("Boolean default value is:\t"+boo);
		
		DefaultValuesExample obj = new DefaultValuesExample();
		System.out.println("Value of a is:\t" + obj.a);
		
		
	}

}
