package com.structural.commandDesignPattern;

public class TestRemoteControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		remote.setCommand(new LightOnCommand(light));
		remote.buttonPressed();
		
		remote.setCommand(new StereoOnWithRadio(stereo));
		remote.buttonPressed();
		
		remote.setCommand(new StereoOffCommand(stereo));
		remote.buttonPressed();
		
		remote.setCommand(new LightOffCommand());
		remote.buttonPressed();
	}

}
