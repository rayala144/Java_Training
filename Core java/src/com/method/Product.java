package com.method;

public class Product {
	
	private String name;
	private String category;
	private int price;
	private int serial_number;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public int getSerial_number() {
		return serial_number;
	}




	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + ", serial_number="
				+ serial_number + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
