package com.keyword.finalExample;

public class CubeValue {

	int cube(final int n) {
		// n += 2 can't be done here (cannot change value of n)
		return (n*n*n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CubeValue objCubeValue = new CubeValue();
		System.out.println(objCubeValue.cube(6));
	}

}
