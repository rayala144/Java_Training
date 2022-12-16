package com.creational.factoryDesignPattern;

public class TestFactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "32 GB", "2.5 TB", "i9-9900K", true, true);
		Computer server = ComputerFactory.getComputer(ComputerType.Server, "8 GB", "1 TB", "i5 11th gen", true, false);
		Computer laptop = ComputerFactory.getComputer(ComputerType.Laptop, "16 GB", "1.5 TB", "i7 11th gen", true, true);
		
		System.out.println(pc.toString());
		System.out.println(server.toString());
		System.out.println(laptop.toString());
		
		
	}

}
