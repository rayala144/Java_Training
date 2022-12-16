package com.collections.MapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class TestCreateMap {
	
	private static void print(Object j) {
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> obj = new HashMap<>();
		obj.put(9, "White");
		obj.put(12, "grey");
		obj.put(13, "Green");
		obj.put("Fruit", "Guava");
		obj.put(23.53f, 'Y');
		// System.out.println(obj);
		
		Map<Integer, Character> obj1 = new HashMap<>();
		obj1.put(1, 'A');
		obj1.put(2, 'B');
		obj1.put(3, 'B');
		obj1.put(4, 'A');
		obj1.put(5, 'Y');
		obj1.put(6, 'I');
		// System.out.println(obj2);
		
		print(obj.size());
		print(obj.isEmpty());
		print(obj1.remove(4));
		print(obj1);
		print("--------");
		print(obj1.get(6));
		
		
		
		

		print("Getting all the pairs");
		
		print("------way 1 : using for each loop-----");
		Set<Integer> obj2 = obj1.keySet();
		for(Integer i:obj2) {
			print("Keys: "+i+" values: "+obj1.get(i));
		}
		
		
		
	
		print("------way 1 : using iterator interface-----");
		Iterator<Integer> itr = obj2.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			print(key+" "+obj1.get(key));
			
		}
		
		
		// Merging two objects
		// obj.putAll(obj2);
		// System.out.println(obj);
	}

}
