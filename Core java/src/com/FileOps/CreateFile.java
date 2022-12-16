package com.FileOps;

import java.io.File;

public class CreateFile {
	
	static void File_create(final String fileName) {
		try {
			File objFile = new File(fileName);
			if(objFile.createNewFile()) {
				System.out.println("File created succssfully!");
			}
			else {
				System.out.println("File not created!!");
				System.exit(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String fileName = "sample file 1.java";
		File_create(fileName);
		

	}

}
