package com.nt.Socketprogramming;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket socket = new Socket("10.150.57.60", 9960);
		DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
		dout.writeUTF("Hello Server Sukumarrrrrrr");
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = bfr.readLine();
		System.out.println(str);
		dout.flush();
		dout.close();
	}

}
