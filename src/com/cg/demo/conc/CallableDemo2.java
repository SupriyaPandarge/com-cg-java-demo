package com.cg.demo.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.cg.demo.col.Employee;

public class CallableDemo2 implements Callable<Employee> {
	//public class CallableDemo implements Callable<Employee> {

		public static void main(String[] args) throws InterruptedException, ExecutionException {

			CallableDemo2 obj = new CallableDemo2();

			ExecutorService service = Executors.newSingleThreadExecutor();
			
			Future<Employee> future = service.submit(obj); // A Future represents the result of an asynchronous computation.

			Employee num = future.get();

			System.out.println(num);
			service.shutdown();
		}

		@Override
		public Employee call() throws Exception {
			Employee obj = new Employee(1,"pfg",50000);
			return obj;
//		public Employee call() throws Exception {
//			int num = 0;
//			for (int i = 0; i <= 10; i++) {
//				num += i;
//			}
//			return num;
		}
}
