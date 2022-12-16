package com.DatagramTransport;


import java.net.*;

public class DGReceiver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DatagramSocket dSocket = new DatagramSocket(3000);
		byte[] buf = new byte[2048];
		DatagramPacket dPacket = new DatagramPacket(buf, 2048);
		dSocket.receive(dPacket);
		String message = new String(dPacket.getData(), 0, dPacket.getLength());
		System.out.println(message);
		dSocket.close();
	}

}
