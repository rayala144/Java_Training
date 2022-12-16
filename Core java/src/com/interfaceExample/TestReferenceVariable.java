package com.interfaceExample;


interface Eclipse{
	void hello();
}

class Cool implements Eclipse{

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hii hello go to hell!!!");
	}
	
}

public class TestReferenceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse ref;
		Cool objCool = new Cool();
		ref = objCool;
		ref.hello();

	}

}
