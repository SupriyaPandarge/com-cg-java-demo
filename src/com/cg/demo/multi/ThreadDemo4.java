package com.cg.demo.multi;

public class ThreadDemo4 extends Thread {

	public void printLoop() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);

		}
	}

	@Override
	public void run() {
		this.printLoop();
	}

	public static void main(String[] args) {

		ThreadDemo4 obj = new ThreadDemo4();
		ThreadDemo4 obj2 = new ThreadDemo4();
		ThreadDemo4 obj3 = new ThreadDemo4();
		obj.start();
		obj2.start();
		obj3.start();
//		obj.printLoop();
//		obj2.printLoop();
//		obj3.printLoop();
	}
}

