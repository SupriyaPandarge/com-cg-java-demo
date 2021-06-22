package com.cg.demo;

import java.util.Scanner;

public class RelationalDemo {
	public static void main(String[] args) {
		//int i=20, j=70;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two integers:");
		int i = sc.nextInt();
		System.out.println(i);
		
		int j = sc.nextInt();
		System.out.println(j);
		
		
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
	}
}
