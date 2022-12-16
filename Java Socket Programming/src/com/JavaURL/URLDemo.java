package com.JavaURL;

import java.net.*;

public class URLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://www.geeksforgeeks.org/tcp-ip-model/?");
			System.out.println("Protocol, hostname, port number, file name: " + url.getProtocol() + " " + url.getHost()
					+ " " + url.getPort() + " " + url.getFile());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
