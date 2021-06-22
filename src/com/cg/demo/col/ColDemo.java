package com.cg.demo.col;

import java.util.ArrayList;

public class ColDemo {

	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(20.75);
		myList.add("Abc");
		System.out.println(myList.size());
		System.out.println(myList);
	}
}
