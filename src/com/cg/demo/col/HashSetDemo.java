package com.cg.demo.col;

import java.util.ArrayList;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		HashSet obj2 = new HashSet();
		
		Random r = new Random();
		for (int i = 1; i<=10; i++) {
			int num = r.nextInt(5);
			obj.add(num);
			obj2.add(num);
			
		}
		System.out.println("List: " + obj);
		System.out.println("Set: " + obj2);
	}

//	private void add(int num) {
//		// TODO Auto-generated method stub
//		
//	}
}
