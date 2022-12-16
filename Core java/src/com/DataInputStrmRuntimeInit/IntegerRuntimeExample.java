package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class IntegerRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 3 numbers:");
		int a, b, x, c;
		a=Integer.parseInt(dis.readLine());
		b=Integer.parseInt(dis.readLine());
		x = Integer.parseInt(sc.nextLine());
		c=(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
