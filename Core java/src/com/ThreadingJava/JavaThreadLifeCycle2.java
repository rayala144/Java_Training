package com.ThreadingJava;

class Shared {

   synchronized void methodOne(Shared s) {       //Stores s = s2
        
        try {
            Thread.sleep(400);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
            
        s.methodTwo(this);
    }
    
    synchronized void methodTwo(Shared s) {
        
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        s.methodOne(this);
    }
}



public class JavaThreadLifeCycle2 {
    
    public static void main(String[] args) {
        
        final Shared s1 = new Shared();
        final Shared s2 = new Shared();
        
        Thread t1 = new Thread() {
            
            public void run() {
                s1.methodOne(s2);
            }
        };
        
        Thread t2 = new Thread() {
            
            public void run() {
                s2.methodTwo(s1);
            }
        };
        
        t1.start();
        
        t2.start();
        
        try {
            Thread.sleep(700);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        //Checking states of both the threads
        
        System.out.println("t1 object is...."+t1.getState()); //Output : Blocked
        
        System.out.println("t2 object is...."+t2.getState()); //Output : Blocked
    }



}