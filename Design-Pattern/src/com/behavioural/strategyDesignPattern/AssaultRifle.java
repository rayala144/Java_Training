package com.behavioural.strategyDesignPattern;

public class AssaultRifle extends Enemy implements Weapon {

	/*
	 * Strategy object 1
	 */

	private final int damage = 10;
	private int rounds;

	public AssaultRifle(int num) {
		// TODO Auto-generated constructor stub
		this.rounds = num;
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		super.gotHit(rounds * damage);
		System.out.println("Enemy was shot " + rounds + " rounds with an assault rifle ");
	}

}
