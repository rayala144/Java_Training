package com.behavioural.strategyDesignPattern;

public class ShotGun extends Enemy implements Weapon {

	/*
	 * Strategy object 2
	 */

	private final int damage = 30;
	private int rounds;

	public ShotGun(int rounds) {
		super();
		this.rounds = rounds;
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		super.gotHit(rounds * damage);
		System.out.println("Enemy was shot " + rounds + " rounds with a shot gun");

	}

}
