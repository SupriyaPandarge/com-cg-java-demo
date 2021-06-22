package com.cg.demo.encap;


class Phone{// parent / super  class
	void call() {
		System.out.println("Calling...");
	}
	void sms() {
		System.out.println("Sending sms...");
	}
}


 class FeaturePhone extends Phone { // child / sub class
	void music() {
		System.out.println("Playing Music...");
	}
 }	
 
 class SmartPhone extends FeaturePhone {
	 void camera() {
		 System.out.println("capture pics...");
	 }
 }



public class PhoneDemo {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.call();
		phone.sms();
		
		FeaturePhone feature = new FeaturePhone();
		feature.music();
		feature.call();
		feature.sms();
		
		SmartPhone smartphone = new SmartPhone();
		smartphone.camera();
		
	}
}
