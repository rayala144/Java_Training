package com.DatagramTransport;

import java.net.*;

public class DGSender {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket dSocket = new DatagramSocket();
		String welcome = "Welcome to this lol";
		InetAddress ipAddress = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket dPacket = new DatagramPacket(welcome.getBytes(), welcome.length(), ipAddress, 3000);
		dSocket.send(dPacket);
		dSocket.close();
	}

}
