package com.FileOps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ExBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reading content from file
		Scanner sc = new Scanner(System.in);
		String File_path = sc.nextLine();
		File objFile = new File(File_path);
		sc.close();
		
		String text;
	
		try {
			FileReader objFileReader = new FileReader(objFile.getAbsoluteFile());
			BufferedReader objBR = new BufferedReader(objFileReader);
			
			// reading text from file
			System.out.print("Content of the file: ");
			while((text = objBR.readLine()) != null) {
				System.out.println(text);
			}
			
			objBR.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
