package com.jdk8.filterExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 3, 7, 12, 20, 8, 17, 15, 6);

		List<Integer> evenIntegers = new ArrayList<>();

		// without stream
		for (int i : list) {
			if (i % 2 == 0) {
				evenIntegers.add(i);
			}
		}
		System.out.println("Even numbers: " + evenIntegers);

		// with stream
		System.out.println("-------with stream------");
		List<Integer> evenNumbers = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers with stream and filter: " + evenNumbers);

		// Not storing into a collection object
		System.out.println("-----------direct print without storing object-------");
		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		// another way of replacing lambda expression
		System.out.println("--------using method reference-------");
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
