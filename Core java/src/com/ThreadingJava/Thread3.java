package com.ThreadingJava;

class Apple1 extends Thread {
	
	
	@SuppressWarnings("deprecation")
	public void run() { // pre-defined method
		for(int i = 0; i < 10; i++) {
			System.out.println("i value is "+i);
			if (i == 5) {
				stop(); // same as break; statement
					
			}
			else continue;
		}
	}
}

public class Thread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Apple1().start();

	}

}
