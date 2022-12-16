package com.jdk8.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<>();
		String[] test = {"What", "in", "the", "hell", "are", "you", "guys", "doing?"};
		words = Arrays.asList(test);
		System.out.println("--------Reversing Strings------");
		words.stream().forEach(n -> System.out.println(new StringBuilder().append(n).reverse()));
		
		System.out.println("-------Printing odd sized Strings----------");
		words.stream().filter(n -> n.length() % 2 != 0).forEach(k -> System.out.println(k));
		
	}

}
