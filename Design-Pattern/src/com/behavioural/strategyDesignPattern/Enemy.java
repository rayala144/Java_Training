package com.behavioural.strategyDesignPattern;

public class Enemy {

	static int health = 100;

	public static void gotHit(int damage) {
		health -= damage;

	}

}
