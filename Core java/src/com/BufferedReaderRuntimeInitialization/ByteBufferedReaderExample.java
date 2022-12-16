package com.BufferedReaderRuntimeInitialization;
import java.io.*;
import java.util.*;

public class ByteBufferedReaderExample {

	// @SuppressWarnings("deprecation")
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 numbers:");
		byte a, b, x, c;
		a=Byte.parseByte(br.readLine());
		b=Byte.parseByte(br.readLine());
		x = Byte.parseByte(sc.nextLine());
		c=(byte)(a+b+x);
		System.out.println("Addition of 3 numbers:\t"+c);
		sc.close();
	}

}
