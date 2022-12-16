package com.creational.factoryDesignPattern;

public class ComputerFactory {
	
	private ComputerFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		switch (computerType) {
		case PC: {
			return new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		}
		case Server: {
			return new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		}
		case Laptop: {
			return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		}
		default:
			throw new RuntimeException("Invalid Computer Type");
		}
	}
	
}
