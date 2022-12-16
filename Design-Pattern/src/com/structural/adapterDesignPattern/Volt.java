package com.structural.adapterDesignPattern;

public class Volt {
	
	private int volts;

	public Volt(int volts) {
		super();
		this.volts = volts;
	}

	public int getVolts() {
		return volts;
	}

	@Override
	public String toString() {
		return "Volt [volts=" + volts + "]";
	}
	
	
	
}
