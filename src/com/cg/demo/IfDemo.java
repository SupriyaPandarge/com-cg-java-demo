package com.cg.demo;

public class IfDemo {
	public static void main(String[] args) {
		int salary = 12;
		int leaves = 15;
		int expectedSalary = 12;
		int expectedleaves = 20;
		
		if(salary >= expectedSalary) {
			System.out.println("join the company");
		}else {
			System.out.println("Do not join the company");
		}
		
		if(salary >= expectedSalary && leaves >= expectedleaves) {
			System.out.println("Join the company");
		}else {
			System.out.println("Do not join the company");
		}
		
				
		
	}
}
