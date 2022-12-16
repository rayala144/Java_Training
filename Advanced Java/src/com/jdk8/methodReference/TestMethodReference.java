package com.jdk8.methodReference;

@FunctionalInterface
interface J {
	public void hi();
}

class C {
	public static void welcome() {
		System.out.println("Hi welcome to this method");
	}
}

public class TestMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J obj = C :: welcome; // JVM creates lambda expression internally
		obj.hi(); 
		
	}

}
 /*
  * J obj = (){
  * 			System.out.println("........");
  * 		  }
  * 
  * J obj = public void hi() {
  * 							System.out.println("........");
  * 						 }		
  */

