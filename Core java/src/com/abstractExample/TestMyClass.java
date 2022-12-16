package com.abstractExample;


import java.util.Scanner;

class Mathematics{
	
	public void calculate(double x) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter operation: ");
		String Operation = sc.nextLine();
		
		if (Operation == "Square"){
			System.out.println(x*x);
			return;
		
		}
		
		if (Operation == "Cube"){
			System.out.println(Math.pow(x, 3));
			return;

		}
		
		if (Operation == "Square Root"){
			System.out.println(Math.sqrt(x));
			return;
		}
		
		else {
			System.out.println("Go byeee");
			return;
		}
		
		
		
		
	}
	
}


public class TestMyClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathematics obj = new Mathematics();
		obj.calculate(25.0d);

	}

}
