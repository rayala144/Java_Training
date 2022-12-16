package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.util.Scanner;

public class StringBufferedReaderExample {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name:");
		String name = br.readLine();
		System.out.println("Your name is:\t"+name);
		// sc.close();
	}

}
