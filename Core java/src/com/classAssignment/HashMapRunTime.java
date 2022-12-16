package com.classAssignment;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> obj = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of products: ");
		int num_opt = sc.nextInt();
		for(int i = 0; i <= num_opt; i++) {
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			System.out.println("Enter product: ");
			String product = sc.next();
			obj.put(id, product);
		}
		
		System.out.println(obj);
	}

}
