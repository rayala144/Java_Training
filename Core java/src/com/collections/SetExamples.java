package com.collections;
// import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetExamples {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HashSet without generic
		HashSet obj = new HashSet<>();
		obj.add("Orange");
		obj.add(12.78f);
		obj.add('A');
		obj.add(87.34d);
		obj.add(true);
		obj.add(30);
		// System.out.println(obj);
		
		
		// HashSet with generic
		HashSet<Integer> obj1 = new HashSet<>();
		obj1.add(127);
		obj1.add(9);
		obj1.add(87);
		obj1.add(12);
		obj1.add(30);
		System.out.println(obj1);
		
		
		// Set with generic
		Set<String> obj2 = new HashSet<>();
		obj2.add("Apple");
		obj2.add("Mango");
		obj2.add("Harry Potter");
		obj2.add("Tom Hanks");
		System.out.println(obj2);
		
		
		obj.addAll(obj1);
		System.out.println(obj);
		obj.addAll(obj2);
		System.out.println(obj);
	
	}

}
