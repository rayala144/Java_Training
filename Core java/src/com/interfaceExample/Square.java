package com.interfaceExample;
// import java.util.*;

public class Square implements single{
	
	int i;
	
	public Square(int length) {
		// TODO Auto-generated constructor stub
		i = length;
	}
	
	
	public void area() {
		System.out.println("Area of square with side-length = "+i+" is " +i*i);
	}



}
