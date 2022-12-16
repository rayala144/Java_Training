package com.creational.factoryDesignPattern;

public class Server implements Computer{

	private String ram;
	private String hdd;
	private String cpu;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	public Server(String ram, String hdd, String cpu, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String ram() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hdd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cpu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isGraphicsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBluetoothEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Server [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnabled="
				+ isGraphicsEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
}
