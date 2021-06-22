package com.cg.demo.multi;

public class DaemonDemo extends Thread {

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread..");
		}else {
			System.out.println("non-daemon thread..");
		}
	}
	public static void main(String[] args) {
		DaemonDemo obj1 = new DaemonDemo();
		DaemonDemo obj2 = new DaemonDemo();
		obj1.setDaemon(true);
		obj1.start();
		obj2.start();
	}
}
