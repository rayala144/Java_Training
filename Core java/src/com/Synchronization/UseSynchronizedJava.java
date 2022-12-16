package com.Synchronization;


class Table {
	synchronized void printTable (int n){
		// method not synchronized
		for(int i = 0; i <= 5; i++) {
			
		System.out.println(n*i);
		
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
}

class Mythread1 extends Thread {
	
	Table table;
	public Mythread1(Table table) {
		// TODO Auto-generated constructor stub
		this.table = table;
	}
	
	public void run() {
		table.printTable(100);
		
	}
}


class Mythread2 extends Thread {
	Table table;
	
	public Mythread2(Table table) {
		// TODO Auto-generated constructor stub
		this.table = table;
	}
	
	public void run() {
		table.printTable(100);
		
	}
}




public class UseSynchronizedJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table(); // only one object
		Mythread1 t1 = new Mythread1(obj);
		Mythread2 t2 = new Mythread2(obj);
		t1.start();
		t2.start();
	}
}

