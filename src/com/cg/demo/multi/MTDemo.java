package com.cg.demo.multi;

public class MTDemo extends Thread {
	public void run() {
		System.out.println("name: " + Thread.currentThread().getName());
		System.out.println("priority: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		MTDemo obj = new MTDemo();
		MTDemo obj1 = new MTDemo();
		obj.setName("supi");
		System.out.println(obj.getName());
		obj.setPriority(4);
		obj1.setPriority(5);
		obj.start();
		obj1.start();
		
		
	}
}
