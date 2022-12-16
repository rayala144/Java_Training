package com.collections.MapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(101, "Kevin", 1500);
		Employee e2 = new Employee(102, "Stanford", 2500);
		Employee e3 = new Employee(103, "Kate", 1000);
		Employee e4 = new Employee(104, "Bruce", 3500);
		Employee e5 = new Employee(105, "Jackie Chan", 7000);
		
		Map<Integer, Employee> obj = new HashMap<>();
		obj.put(e1.getEmpID(), e1);
		obj.put(e2.getEmpID(), e2);
		obj.put(e3.getEmpID(), e3);
		obj.put(e4.getEmpID(), e4);
		obj.put(e5.getEmpID(), e5);
		
		// Using iterator
		Iterator<Integer> itr = obj.keySet().iterator();
		while(itr.hasNext()) {
			Employee e = obj.get(itr.next());
			e.displayDetails();

		}
	}

}
