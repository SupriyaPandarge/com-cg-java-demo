package com.cg.demo.encap;

//import java.io.ObjectInput;

public class EncapDemo {
	public static void main(String[] args) {
//		BankCustomer obj = new BankCustomer();
//		//obj.balance = 10000;
//		System.out.println(obj.checkBalance());
//		
//		obj.deposit(8000);
//		System.out.println(obj.checkBalance());
//		
//		obj.withdraw(1000);
//		System.out.println(obj.checkBalance());
	
	
	Demo demo = new Demo();
	System.out.println(demo.getNum());
	demo.setNum(10);
	System.out.println(demo.getNum());
//	System.out.println(demo.getNum());
	//demo.num = 10;
	
}
}