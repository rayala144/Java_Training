package com.DataInputStrmRuntimeInit;
import java.io.*;
import java.util.Scanner;

public class FloatRuntimeExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter 3 numbers:");
		float a, b, x, c;
		a=Float.parseFloat(dis.readLine());
		b=Float.parseFloat(dis.readLine());
		x = Float.parseFloat(sc.nextLine());
		c=(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
