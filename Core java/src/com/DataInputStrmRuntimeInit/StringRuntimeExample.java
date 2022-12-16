package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class StringRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter name:");
		String name = dis.readLine();
		System.out.println("Your name is:\t"+name);
		// sc.close();
	}

}
