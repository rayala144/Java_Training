package com.javaAssignments;
import java.util.*;

public class charReturnType {
	
	public char grade() {
		Scanner sc = new Scanner(System.in);
		char gr = sc.next().charAt(0);
		sc.close();
		return gr;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
