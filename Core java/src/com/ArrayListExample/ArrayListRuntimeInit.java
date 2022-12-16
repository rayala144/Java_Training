package com.ArrayListExample;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRuntimeInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> obj = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chey ra redflower: ");
		for(int i=0; i <= 2; i++) {
			Object element = sc.nextLine();
			obj.add(element);
		}
		System.out.println("ArrayList is: "+obj);
		sc.close();
		
	}

}
