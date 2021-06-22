package com.cg.demo;

import java.util.Scanner;

public class CheckPowerNo {
	static boolean checkNumber(int n) {
		if (n == 0)
			return false;
		while( n!= 1)
		{
			if(n % 2 != 0)
				return false;
			n = n/2;
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter an integer:");
		int num = sc.nextInt();
		if (checkNumber(num))
			System.out.println("Number is power of 2");
		else
			System.out.println("Number is not power of 2");
	}
}
