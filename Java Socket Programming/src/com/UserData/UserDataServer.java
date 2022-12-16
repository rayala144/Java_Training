package com.UserData;

import java.io.*;
import java.net.*;
import java.util.*;
public class UserDataServer {
	
	private Socket socket = null;
	
	public UserDataServer(int port) {
		// TODO Auto-generated constructor stub
		try {
			ServerSocket serverSocket = new ServerSocket(9865);
			Socket s = serverSocket.accept();
			
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			
			while (true) {
				String input = dis.readUTF();
				if (input.equals("bye"))
					break;
				System.out.println("Command received");
				
				StringTokenizer st = new StringTokenizer(input);
				String name = st.nextToken();
				String ID = st.nextToken();
				String phnNmbr = st.nextToken();
				String result = "";
				if (name.equals("Name".toLowerCase())) {
					result += "Akhil, ";
				}
				if (ID.equals("UserID".toLowerCase())) {
					result += "52114568,";
				}
				if (phnNmbr.equals("Phone".toLowerCase())) {
					result += "9182674883";
				}
				else {
					result = "Invalid command";
				}
				System.out.println("Sending result");
				dos.writeUTF(result);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
	
	public static void main(String[] args) {
		UserDataServer server = new UserDataServer(6000);
		
	}
}
