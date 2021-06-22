package com.cg.demo.col;

import java.util.ArrayList;

public class GenericDemo2 {

	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	al.add("Suresh");
	al.add("naresh");
	System.out.println(al);
	
	String s1 = al.get(1);
	System.out.println(s1);
}
}
