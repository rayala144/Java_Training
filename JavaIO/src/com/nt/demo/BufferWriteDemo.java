package com.nt.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fWriter = new FileWriter("Assertion.txt", true);
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(100);
		bWriter.newLine();
		char[] alphas = {'f', 'c', 'k', ' ', 'u'};
		bWriter.write(alphas);
		bWriter.newLine();
		bWriter.write("Akhil is a good gigchaad");
		bWriter.flush();
		bWriter.close();
	}

}
