package com.cg.demo;
import java.util.Scanner;

public class SumOfFirstNaturalNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value of integer:");
		int num = sc.nextInt();
		
		System.out.println("Number divisible by 3 and 5");
		
		int i;
		int sum=0;
		for(i=1; i<=num; ++i) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
