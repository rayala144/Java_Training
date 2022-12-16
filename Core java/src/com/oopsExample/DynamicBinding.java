package com.oopsExample;
import java.util.Scanner;

public class DynamicBinding {
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Your name is " + name);
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicBinding obj = new DynamicBinding();
		obj.getData();
	}

}
