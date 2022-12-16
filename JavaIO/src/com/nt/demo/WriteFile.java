package com.nt.demo;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\rayala.akhil\\eclipse-workspace\\JavaIO\\Assertion44.txt", true);
		fw.write("This is a generated data string from java file writer");
		fw.write("\n");
		char[] alphas = {'a', 'b', 'c'};
		fw.write(alphas);
		fw.flush();
		fw.close();
	}

}
