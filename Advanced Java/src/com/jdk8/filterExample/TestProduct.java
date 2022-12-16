package com.jdk8.filterExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> newStock = new ArrayList<>();
		newStock.add(new Product(101, "Soaps", 250));
		newStock.add(new Product(123, "Milk", 550));
		newStock.add(new Product(243, "Shampoos", 120));
		newStock.add(new Product(074, "Hair Oil", 350));
		newStock.add(new Product(902, "Palm Oil", 400));
		
		System.out.println("---------using filter-------------");
		newStock.stream().filter(stock -> stock.productPrice >= 250).forEach(stock -> System.out.println(stock.productName));
		
		System.out.println("-------using collect-----------");
		List<Product> collectProducts = newStock.stream().filter(p -> p.productPrice >= 300).collect(Collectors.toList());
		collectProducts.stream().forEach(n -> System.out.println(n.productName));
	}

}
