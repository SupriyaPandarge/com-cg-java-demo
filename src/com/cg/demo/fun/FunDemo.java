package com.cg.demo.fun;

public class FunDemo {

	public static void main(String[] args) {

		FunIn funIn = (int i) -> {
			System.out.println("functionalMethod");
			return false;
		};

		funIn.functionalMethod(10);

	}
}
