package com.cg.demo.access;

import com.cg.demo.method.Employee;

import com.cg.demo.method.DemoClass;
//import com.cg.demo.method.*;

public class App {
	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		System.out.println(obj.publicField);
//		System.out.println(obj.protectedfield);
//		System.out.println(obj.packageField);
//		System.out.println(obj.privateField);
	}
	
	com.cg.demo.method.Employee emp = new com.cg.demo.method.Employee();
	com.cg.demo.pc2.Employee emp2 = new com.cg.demo.pc2.Employee();
}
