package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.util.Scanner;

public class LongBufferedReaderExample {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 numbers:");
		long a, b, x, c;
		a=Long.parseLong(br.readLine());
		b=Long.parseLong(br.readLine());
		x = Long.parseLong(sc.nextLine());
		c=(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
