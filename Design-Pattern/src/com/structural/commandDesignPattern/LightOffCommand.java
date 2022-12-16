package com.structural.commandDesignPattern;

public class LightOffCommand implements Command {
	
	Light light;
		
	public void setLight(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

}
