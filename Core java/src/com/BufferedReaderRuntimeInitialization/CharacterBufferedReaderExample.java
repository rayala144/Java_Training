package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.util.Scanner;

public class CharacterBufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your gender: ");
		char Gender;
		Gender = (char)br.read();
		System.out.println("My Gender is:\t"+Gender);
	}

}
