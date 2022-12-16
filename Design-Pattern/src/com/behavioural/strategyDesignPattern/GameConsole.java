package com.behavioural.strategyDesignPattern;

public class GameConsole {

	/*
	 * Context object
	 */

	private Weapon weapon; // instantiation is hidden here

	public void selectWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void shootEnemy() {

		weapon.fire();

		if (Enemy.health > 0)
			System.out.println("Enemy's health reduced to " + Enemy.health + "\n");

		if (Enemy.health <= 0) {
			System.out.println("Enemy's health reduced to 0");
			System.out.println("Enemy died...");
		}

	}

}
