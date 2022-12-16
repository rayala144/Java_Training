package com.nt.SocketChat;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	ServerSocket server;
	Socket socket;
	BufferedReader br;
	PrintWriter out;

	public Server() throws IOException {
		server = new ServerSocket(777);
		System.out.println("Server is ready to accept connection");
		System.out.println("Waiting.....");
		socket = server.accept();
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream());
		startReading();
		startWriting();
	}

	private void startReading() {
		Runnable r1 = () -> {
			System.out.println("reader started....");
			try {
				while (true) {

					String msgString = br.readLine();
					if (msgString.equals("exit")) {
						System.out.println("Client terminated the chat");
						socket.close();
						break;
					} else if (msgString.equals("search")){
						
					}
					System.out.println("Client : " + msgString);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		};

		new Thread(r1).start();
	}

	public void startWriting() {

		Runnable r2 = () -> {

			System.out.println("Writer starter......");

			try {
				while (true) {
					BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
					String content = br1.readLine();

					out.println(content);
					out.flush();
					if (content.equals("exit")) {
						socket.close();
						break;

					}

				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		};
		new Thread(r2).start();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("this is server going to start server::");
		new Server();

	}
}