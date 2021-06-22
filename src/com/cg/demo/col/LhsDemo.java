package com.cg.demo.col;

import java.util.LinkedHashSet;

public class LhsDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
		lhs1.add("abc");
		lhs1.add("sdf");
		lhs1.add("ghj");
		System.out.println(lhs1);
		
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
		lhs2.add(53);
		lhs2.add(42);
		lhs2.add(1);
		lhs2.add(0);
		System.out.println(lhs2);
	}
}
