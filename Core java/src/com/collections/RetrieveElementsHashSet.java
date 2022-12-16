package com.collections;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.fasterxml.jackson.core.sym.Name;

public class RetrieveElementsHashSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
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
		
		
		
		// for each loop technique
		System.out.println("--------Printing obj1--------");
		for (int i:obj1) {
			System.out.println(i);
		}
		
		System.out.println("--------Printing obj--------");
		
		for (Object i:obj) {  // Object class for 'i' variable (God class)
			System.out.println(i);
		}
		
		
		
		// Iterator technique
		System.out.println("--------iterating obj--------");
		
		Iterator<Object> itr = obj.iterator(); // Object class (GODDDDD!!!!!)
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		// forEach method
		System.out.println("--------using forEach--------");
		obj.forEach(n-> System.out.println(n));
	
		// add 50 elements
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("-------------Adding 50 elements -------------");
		
		for(int i = 0; i <= 50 ; i++) {
			// HashSet<Integer> sample = obj;
			String name = sc.next();
			obj.add(name);	
		}
		
		
		// System.out.println(obj1);
		for (Object i:obj) {
			System.out.println(i);
		}
		
	}

}
