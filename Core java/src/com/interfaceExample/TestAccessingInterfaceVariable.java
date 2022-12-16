package com.interfaceExample;


interface Cricket{
	int players = 11; // static final by default
	int empire = 1; // static final by default
}


class Game implements Cricket{
	void play() {
		System.out.println("Players: "+players); // cannot change or increment 'players' here
		System.out.println("Empire: "+empire); // cannot change or increment 'empire' here
	}
}

public class TestAccessingInterfaceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game gm = new Game();
		gm.play();
	}

}
