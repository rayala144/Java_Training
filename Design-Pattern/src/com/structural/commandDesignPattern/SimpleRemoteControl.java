package com.structural.commandDesignPattern;

public class SimpleRemoteControl {

	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonPressed() {
		command.execute();
	}
	
	
}
