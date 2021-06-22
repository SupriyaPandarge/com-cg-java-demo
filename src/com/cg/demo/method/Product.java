package com.cg.demo.method;

public class Product {
	String name;
	int quantity;
	double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public Product(String name, int quantity, double price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
