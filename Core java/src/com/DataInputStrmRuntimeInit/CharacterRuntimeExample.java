package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class CharacterRuntimeExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter your gender: ");
		char Gender;
		Gender = (char)dis.read();
		System.out.println("My Gender is:\t"+Gender);
	}

}
