package com.keyword.thisKeyword;

public class Test {
	
	int a = 10;
	int b = 11;
	
	Test getData() {
		return this;
	}
	
	void display() {
		System.out.println("a: "+a+", b: "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tst = new Test();
		System.out.println(tst.getData());
		tst.display();
		
		System.out.println("------------------");
		
		Test object = tst.getData(); // getData() returns Test object and assigns it to 'object'
		System.out.println("a = "+ object.a); // 'object' contains both 'a' and 'b'
		System.out.println("b = "+ object.b);

	}

}
