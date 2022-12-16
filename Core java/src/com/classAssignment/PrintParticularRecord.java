package com.classAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PrintParticularRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> obj = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 4; i++) {
			Object k = sc.nextLine();
			obj.add(k);
		}
		
		System.out.print("Enter index: ");
		int index = sc.nextInt();
		List<Object> list = new ArrayList<>(obj);
		
		if(index < list.size()) {
		Object record = list.get(index);
		System.out.println("Value at the specified index: "+record);
		}
		
		else System.out.println("Index out of bounds");
		
	}

}
