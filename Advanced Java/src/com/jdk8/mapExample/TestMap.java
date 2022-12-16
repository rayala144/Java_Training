package com.jdk8.mapExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicle = Arrays.asList("Bulldozer", "Truck", "Car", "Motor Cycle");
		List<String> vehicle_Upper = new ArrayList<>();
		
		vehicle_Upper = vehicle.stream().map(v -> v.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicle_Upper);
		
		System.out.println("______________________________________________");
		vehicle.stream().forEach(v -> System.out.println(v.length()));
		
		
	}

}
