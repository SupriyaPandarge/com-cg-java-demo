package com.cg.demo;

import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		System.out.println("Check if a number is an increasing number ");
		boolean flag = false;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		
		
		
		
		int current_num= num%10;
		num = num/10;
		while(num>0) {
			if(current_num <= num % 10) {
				flag = true;
				break;
			}
			current_num = num % 10;
			num = num / 10;
		}
		
		if(flag) {
			System.out.println("false");}
			else { 
				System.out.println("true");
		}
		
	}
}
