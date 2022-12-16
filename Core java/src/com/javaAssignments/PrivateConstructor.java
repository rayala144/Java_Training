package com.javaAssignments;

class Test {

	  private Test () {
	    System.out.println("Welcome to Private Constructor!!!");
	  }

	  public static void instanceMethod() {
		  
	    Test obj = new Test();
	  }

}

	class PrivateConstructor {

	  public static void main(String[] args) {
		  
	    Test.instanceMethod();
	  }
}
