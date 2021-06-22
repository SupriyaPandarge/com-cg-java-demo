package com.cg.demo.method;

public class App2 {
	public static void main(String[] args) {
	
		
		Product p1 = new Product();
		p1.name= "thn";
		p1.quantity = 1;
		p1.price = 56;
		System.out.println(p1.toString());
		
		Product p2 = new Product("fhj", 786);
		System.out.println(p2.toString());
		
		Product p3 = new Product("fhj", 6, 786);
		System.out.println(p3.toString());
		
}
}
