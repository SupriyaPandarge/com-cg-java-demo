package com.cg.demo.oop;

public class MethodDemo {
	//public static void main(String[] args) {
		//int num1=20;
		//int num2=30;
		//int sum=num1+num2;
		//System.out.println(sum);
	
	static void someMethodName() {
		System.out.println("Some output");
	}
	
	static void addTwoNumbers(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
		someMethodName();
		
		addTwoNumbers(10, 20);
		addTwoNumbers(1, 58);
		
	}
	
	
	

}
