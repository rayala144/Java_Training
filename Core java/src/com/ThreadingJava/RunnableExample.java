package com.ThreadingJava;

class Apple3 implements Runnable {
	
	public void run() {
		System.out.println("Welcome to runnable interface");
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple3 obj = new Apple3();
		Thread thread = new Thread(obj);
		thread.start();
	}

}
