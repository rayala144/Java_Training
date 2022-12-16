package com.polymorphism;


class Apple {
	
	void calc(int x, int y) {
		System.out.println(x*y);
	}
	
	void calc(float a, float b) {
		System.out.println(a + b);
	}
	
}

public class MethodOvrldng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple objApple = new Apple();
		objApple.calc(12, 5);
		objApple.calc(6.43f, 20.234f);

	}

}
