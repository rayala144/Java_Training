package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.util.Scanner;

public class ShortBufferedReaderExample {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 numbers:");
		short a, b, x, c;
		a=Short.parseShort(br.readLine());
		b=Short.parseShort(br.readLine());
		x = Short.parseShort(sc.nextLine());
		c=(short)(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
