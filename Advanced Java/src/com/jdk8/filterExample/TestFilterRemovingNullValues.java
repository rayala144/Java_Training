package com.jdk8.filterExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilterRemovingNullValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> snakes = Arrays.asList("Cobra", "Black Mamba", null, "Rattle snake", null, "Naagu snake", null);
		List<String> pureSnakes = snakes.stream().filter(s -> s != null).collect(Collectors.toList());
		System.out.println(pureSnakes);
	}

}
