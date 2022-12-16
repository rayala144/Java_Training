package com.FileOps;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter file path: ");
		final String filePath = sc.nextLine();
		
		try {
			File objFile = new File(filePath);
			if (objFile.exists() == false) {
				System.out.println("File doesn't exist!!");
			}
			

			int val;
			
			// Object of FileInputStream
			FileInputStream fileIn = new FileInputStream(objFile);
			
			// reading text from file
			System.out.print("Text in the file: ");
			
			while((val = fileIn.read()) != -1) {
				System.out.println(val);
				System.out.println((char)(val));
			}
			
			System.out.println();
			fileIn.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e.toString());
		}

	}

}
