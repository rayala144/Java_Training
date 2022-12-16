package com.structural.commandDesignPattern;

public class StereoOnWithRadio implements Command{

	Stereo stereo;

	public StereoOnWithRadio(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
		stereo.setRadio();
		stereo.setVolume(10);
		
	}

}
