package com.structural.adapterDesignPattern;

public class MobileAdapterImpl implements MobileAdapter {

	private WallSocket wallSocket;

	public MobileAdapterImpl(WallSocket wallSocket) {
		// TODO Auto-generated constructor stub
		this.wallSocket = wallSocket;
	}

	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts() / 80;
		return new Volt(v3);
	}

}
