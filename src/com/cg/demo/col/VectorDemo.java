package com.cg.demo.col;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	Vector<Integer> v = new Vector();
	System.out.println(v.size());
	System.out.println(v.capacity());
	
	for(int i=10; i <=100; i+=10) {
		v.add(new Integer(i));
	}
	System.out.println(v.size());
	System.out.println(v.capacity());
	v.add(110);
	System.out.println(v.size());
	System.out.println(v.capacity());
}
}
