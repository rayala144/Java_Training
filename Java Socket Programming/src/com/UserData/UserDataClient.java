package com.UserData;

import java.io.*;
import java.net.*;
import java.util.*;


public class UserDataClient {
	private Socket socket = null;

	public UserDataClient(String address, int port) {
		// TODO Auto-generated constructor stub
		try {
			// In this Code Input Getting from a user
			Scanner scanner = new Scanner(System.in);
			socket = new Socket("localhost", 9865);
			System.out.println("Connected");
			// Create two objects first is dis and dos for
			// input and output
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

			// Making a Loop
			while (true) {
				System.out.println("Enter command 'give user details'");

				String inp = scanner.nextLine();

				// Check the user input if user enter over
				// then
				// connect is stopped by server and user
				if (inp.equals("Over")) {
					System.out.println("Server stopped");
					break;
				}
				dos.writeUTF(inp);

				String ans = dis.readUTF();
				System.out.print("Details: ");
				System.out.println(ans);
			}
		} catch (Exception e) {
			System.out.println("Error in Connection");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDataClient client = new UserDataClient("127.0.0.2", 6000);
	}

}
