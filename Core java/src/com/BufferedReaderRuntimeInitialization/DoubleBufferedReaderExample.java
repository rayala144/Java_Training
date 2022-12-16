package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.util.Scanner;

public class DoubleBufferedReaderExample {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 doubles:");
		double a, b, x, c;
		a=Double.parseDouble(br.readLine());
		b=Double.parseDouble(br.readLine());
		x = Double.parseDouble(sc.nextLine());
		c=(a+b+x);
		System.out.println("Addition of 3 doubles:\t"+c);
		sc.close();
	}

}
