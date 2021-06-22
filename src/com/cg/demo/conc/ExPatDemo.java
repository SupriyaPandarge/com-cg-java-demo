package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExPatDemo implements Runnable {

	public static void main(String[] args) {
		
		ExPatDemo exp = new ExPatDemo();
		
//		ExecutorService exService = Executors.newSingleThreadExecutor();
//		for(int i=1; i<=10; i++) {
//			exService.execute(exp);
//		}
//		ExecutorService exService = Executors.newCachedThreadPool();
//		ExecutorService exService = Executors.newFixedThreadPool(3);
		ExecutorService exService = Executors.newScheduledThreadPool(3);
		for(int i=1; i<=10; i++) {
			exService.execute(exp);
		}
		exService.shutdown();
	}
		
		@Override
		public void run() {
			for(int i=1; i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+" - "+ i);
			
		}
	}
	
}
