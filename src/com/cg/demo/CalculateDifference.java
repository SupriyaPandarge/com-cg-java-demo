package com.cg.demo;

import java.util.Scanner;

public class CalculateDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value of integer:");
		int num = sc.nextInt();
		
		System.out.println("Calculate difference of numbers");
		
		int i;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for(i=1;i<=num;++i) {
			sum1+=i*i;
		}
		System.out.println("Sum of squares:"  +sum1);
		
		for(i=1;i<=num;++i) {
			sum2+=i;
		}
		System.out.println("Squares of sum:"  +sum2);
		
		sum3= sum1-(sum2*sum2);
		System.out.println("Difference is"  + sum3);
		
		
		
		
		
	}
}
