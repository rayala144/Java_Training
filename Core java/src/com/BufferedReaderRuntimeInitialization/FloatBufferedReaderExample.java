package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.util.Scanner;

public class FloatBufferedReaderExample {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 numbers:");
		float a, b, x, c;
		System.out.print("Enter a:");
		a=Float.parseFloat(br.readLine());
		System.out.print("Enter b:");
		b=Float.parseFloat(br.readLine());
		System.out.print("Enter c:");
		x = Float.parseFloat(sc.nextLine());
		c=(a+b+x);
		System.out.println("Addition of 3 floats:\t"+c);
		sc.close();
	}

}
