package com.jdk8.parallelSort;

import java.util.Arrays;

public class TestParallelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {23, 28, 2, 7, 22, 54, 65, 12, 38, 31, 7, 22, 55, 96, 121, 55, 113, 78};
		Arrays.parallelSort(a);
		for(int i : a) {
			System.out.print(i+", ");
		}
		
		System.out.println("-----Using lambda ---------");
		
		int b[] = {23, 248, 92, 7, 226, 54, 65, 182, 384, 1, 7, 22, 155, 96, 221, 55, 113, 278};
		Arrays.parallelSort(b);
		Arrays.stream(b).forEach(n -> System.out.print(n+", "));
		
	}

}
