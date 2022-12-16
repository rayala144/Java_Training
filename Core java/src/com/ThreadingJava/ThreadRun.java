package com.ThreadingJava;



public class ThreadRun implements Runnable {
	
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("Name of this thread: "+thread.getName());
		
		try {
			System.out.println(thread.getName()+" is going to sleep for 3 seconds");
			Thread.sleep(3000); //sleep is predefined
			System.out.println(thread.getName()+" is awake and exitted");
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRun newTh = new ThreadRun();
		Thread th = new Thread(newTh);
		th.start();

	}

}
