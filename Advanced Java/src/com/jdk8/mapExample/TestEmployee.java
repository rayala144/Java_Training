package com.jdk8.mapExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Dhoni", 7356550));
		employees.add(new Employee(102, "Kohli", 6856820));
		employees.add(new Employee(103, "Rohit", 7353550));
		employees.add(new Employee(104, "Rahul", 4316450));
		employees.add(new Employee(105, "S K Y", 8356550));
		
		List<String> superEmp = employees.stream().filter(e -> e.empSalary >= 6000000).map(e -> e.empName).collect(Collectors.toList());
		System.out.println(superEmp);
	}

}
