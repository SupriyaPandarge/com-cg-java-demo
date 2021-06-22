package com.cg.demo.col;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLL {

	public static void main(String[] args) {
		LinkedList L1 = new LinkedList();
		L1.add(10);
		L1.add(10.5);
		L1.add("Supriya");
		for(int num = 0; num < L1.size(); ++num) {
			System.out.println(L1.get(num));
//			for (LinkedList obj : (LinkedList)L1) {
//				System.out.println(obj);
//			}
			Iterator i = L1.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
				
			
		}
	}
}
