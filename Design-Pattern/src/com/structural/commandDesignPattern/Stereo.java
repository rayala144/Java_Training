package com.structural.commandDesignPattern;

public class Stereo {

	public void on() {
		System.out.println("Stereo is on");
	}
	
	public void off() {
		System.out.println("Stereo is off");
	}
	
	public void setCD() {
		System.out.println("Stereo is set for CD_Input");
	}
	
	public void setDVD() {
		System.out.println("Stereo is set for DVD_Input");
	}
	
	public void setRadio() {
		System.out.println("Stereo is set for radio");
	}
	
	public void setVolume(int volume) {
		System.out.println("Volume is set to "+ volume);
	}
	
	
}
