package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.io.BufferedReader;
// import java.util.Scanner;

public class BooleanBufferedReader {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 boolean:");
		boolean a, b, c;
		a=Boolean.parseBoolean(br.readLine());
		b=Boolean.parseBoolean(br.readLine());
		// x = Boolean.parseBoolean(sc.nextLine());
		c=(a && b);
		System.out.println("AND Boolean of 2 booleans:\t"+c);
		// sc.close();
	}

}
