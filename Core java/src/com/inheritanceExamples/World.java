package com.inheritanceExamples;


public class World {
	String country;
	long pop;
	int lifePeriod;
	int income;
	
	public String popul() {
		return country + "has" + pop + "population";
	}
	
	public String display() {
		return ("Shows the image of "+ country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Life me = new Life("India", 12334324576l, 70, 145000);
		System.out.println(me.getAvgIncome());
		System.out.println(me.getLifePeriod());

	}

}


class Life extends World{
	public Life(String country, long population, int lifeTime, int income) {
		this.country = country;
		pop = population;
		lifePeriod = lifeTime;
		this.income = income;
	}
		
	String getLifePeriod() {
		return "The average lifetime of an "+country+"n is "+lifePeriod;
	}
	
	String getAvgIncome() {
		return "Average income of an "+country+"n is "+income;
	}
	
}
