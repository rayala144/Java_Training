package com.nt.Socketprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(9996);
		System.out.println("Server is created, waiting for client");
		Socket socket = serverSocket.accept();

		System.out.println("Client connected");
		InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String str = bufferedReader.readLine();

		System.out.println(str);
	}

}
