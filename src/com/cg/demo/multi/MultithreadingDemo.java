package com.cg.demo.multi;

public class MultithreadingDemo extends Thread {
	
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		MultithreadingDemo obj = new MultithreadingDemo();
		obj.start();
		obj.getName();
		obj.getPriority();
	}
}
