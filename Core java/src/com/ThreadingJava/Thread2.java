package com.ThreadingJava;


class Apple extends Thread {
	
	public void run() { // pre-defined method
		for(int i = 1; i <= 10; i++) {
			System.out.println("i value is "+i);
		}
	}
}

public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Apple x = new Apple();
//		x.start();    // pre-defined method (starts 'run()' method automatically)
		
		new Apple().start();
		
		

	}

}
