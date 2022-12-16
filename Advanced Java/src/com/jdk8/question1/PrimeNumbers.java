package com.jdk8.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<>();
		Random rd = new Random();
		for(int i = 0 ; i <= 25 ; i++) {
			al.add(rd.nextInt(100));
			// System.out.println(al.get(i));
		}
		
		al.stream().filter(k -> k % 2 != 0 && k % 3 != 0 && k % 5 != 0 && k % 7 != 0).forEach(n -> System.out.println(n));
		
		
				
		
	}

}
