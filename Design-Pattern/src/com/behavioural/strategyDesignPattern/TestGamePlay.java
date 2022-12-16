package com.behavioural.strategyDesignPattern;

public class TestGamePlay {

	public static void main(String[] args) {

		GameConsole gameconsole = new GameConsole();

		gameconsole.selectWeapon(new AssaultRifle(1));
		gameconsole.shootEnemy();

		gameconsole.selectWeapon(new ShotGun(2));
		gameconsole.shootEnemy();
//		
//		gameconsole.selectWeapon(new ShotGun(1));
//		gameconsole.shootEnemy();

	}

}
