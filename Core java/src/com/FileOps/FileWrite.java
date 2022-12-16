package com.FileOps;

import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.File;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String fileName = "Sample file 2.txt";
		
		try {
			File objFile = new File(fileName);
			if(objFile.exists() == false) {
				System.out.println("File created succssfully!");
			}
			else {
				System.out.println("File not created!!");
				System.exit(0);
			}

		System.out.print("Enter text: ");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		FileOutputStream fileOut = new FileOutputStream(objFile);
		
		fileOut.write(text.getBytes());
		fileOut.flush();
		fileOut.close();
		System.out.println("File closed");
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
