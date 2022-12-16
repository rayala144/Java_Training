package com.classAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class SortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> obj = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 4; i++) {
			int k = sc.nextInt();
			obj.add(k);
		}
		
		List<Integer> list = new ArrayList<Integer>(obj);
		Collections.sort(list);
		
		System.out.println("Sorted Hash set is "+list);
		
		
		

	}

}
