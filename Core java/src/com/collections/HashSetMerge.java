package com.collections;

import java.util.HashSet;

public class HashSetMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet obj = new HashSet<>();
		obj.add("Orange");
		obj.add(12.78f);
		obj.add('A');
		obj.add(87.34d);
		obj.add(true);
		obj.add(30);
		
		
		
		HashSet<Integer> obj1 = new HashSet<>();
		obj1.add(127);
		obj1.add(9);
		obj1.add(87);
		obj1.add(12);
		obj1.add(30);
		
		obj.addAll(obj1);
		System.out.println(obj);
	}

}
