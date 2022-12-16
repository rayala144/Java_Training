package com.keyword.finalExample;


class Honda {

	final String speedLimit() {
		int limit = 110;
		return ("Honda bike doesn't exceed "+limit+" kmph speed");
	}


}

public class Ford extends Honda {
	
	/*String speedLimit() {
		cannot override final method
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ford car = new Ford();
		System.out.println(car.speedLimit());
	}

}
