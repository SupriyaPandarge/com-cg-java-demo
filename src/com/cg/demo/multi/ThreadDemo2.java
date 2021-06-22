package com.cg.demo.multi;

public class ThreadDemo2 extends Thread {
	
	public static void main(String[] args) {
		ThreadDemo2 obj1 = new ThreadDemo2();
		System.out.println("thread= " +obj1);
		obj1.start();
		
		
//		ThreadDemo2 obj2 = new ThreadDemo2();
//		obj2.setName("sup");
//		System.out.println("Thread Name= " + obj2);
	}
	public void run() {
		ThreadDemo2 obj2 = new ThreadDemo2();
		obj2.setName("sup");
		System.out.println("Thread Name= " + obj2);
//		ThreadDemo2 obj3 = new ThreadDemo2();
//		System.out.println("Thread Name= "+ obj3.getName());
		
	}

}
