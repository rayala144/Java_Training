package com.FileOps;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method
		final String fileName = "Sample file 3.txt";
		
		try {
			File objFile = new File(fileName);
			if(objFile.exists() == false) {
				if(objFile.createNewFile()) {
					System.out.print("File created successfully ");
				}
				else {
					System.out.println("File creation failed lmao");
					System.exit(0);
				}
			}
			
			String text;
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter text into file: ");
			text = sc.nextLine();
			

			// instance of file writer
			FileWriter objFileWriter = new FileWriter(objFile.getAbsoluteFile());

			// instance of Buffered Reader with respect to File writer
			// BufferedWriter objBW = new BufferedWriter();
			
			// write into file
			objFileWriter.write(text);
			sc.close();

			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
