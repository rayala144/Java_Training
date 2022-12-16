package com.ExceptionHandling;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14, 53};
		try {
			int c = arr[6];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
