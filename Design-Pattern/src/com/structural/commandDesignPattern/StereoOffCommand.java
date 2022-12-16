package com.structural.commandDesignPattern;

public class StereoOffCommand implements Command{

	Stereo stereo;
	
	public void execute() {
		// TODO Auto-generated method stub
		stereo.off();
	}
	
	public StereoOffCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}

}
