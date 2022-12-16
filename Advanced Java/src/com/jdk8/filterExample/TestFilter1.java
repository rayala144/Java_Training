package com.jdk8.filterExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> buses = Arrays.asList("Volvo", "Garuda", "Super Deluxe", "Rajadha");
		List<String> collectBuses = buses.stream().filter(busName -> busName.length() >= 5 && busName.length() < 8)
				.collect(Collectors.toList());
		System.out.println(collectBuses);
	}

}
