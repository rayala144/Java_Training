package com.structural.commandDesignPattern;

public class StereoOnCommandWithCD implements Command{

	Stereo stereo;
	
	public StereoOnCommandWithCD(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setCD();
		stereo.setVolume(20);
	}

}
