package com.collections.VectorExample;

import java.util.Scanner;
import java.util.Vector;

public class VectorExampleRuntimeInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> obj = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chey ra: ");
		for(int i=0; i <= 2; i++) {
			Object element = sc.nextLine();
			obj.add(element);
		}
		System.out.println("Vector is: "+obj);
		sc.close();
	}
	
	

}
