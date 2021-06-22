package com.cg.demo.multi;


public class ThreadDemo extends Thread {

	public static void main(String[] args) throws Exception {
		Thread ob2 = new Thread (new ThreadDemo());
		ob2.start();
		System.out.println("m "+ ob2.isAlive());
		
	}
	public void run() {
		Thread obj = Thread.currentThread();
		System.out.println("r "+ obj.isAlive());
		
	}
}


//public class ThreadDemo implements Runnable {
//
//	public static void main(String[] args) throws Exception {
//		Thread ob2 = new Thread (new ThreadDemo());
//		ob2.start();
//		System.out.println("m "+ ob2.isAlive());
//		
//	}
//	public void run() {
//		Thread obj = Thread.currentThread();
//		System.out.println("r "+ obj.isAlive());
//		
//	}
//}
