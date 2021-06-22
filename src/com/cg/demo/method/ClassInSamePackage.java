package com.cg.demo.method;

public class ClassInSamePackage {
	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		System.out.println(obj.publicField);
		System.out.println(obj.protectedfield);
		System.out.println(obj.packageField);
		//System.out.println(obj.privateField);
	}
}
