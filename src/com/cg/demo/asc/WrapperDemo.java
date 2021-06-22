package com.cg.demo.asc;

public class WrapperDemo {
	public static void main(String[] args) {
//		String name = "sonu";
//		int num = 10;
//		//num.
//		Integer num2 = 10;
//		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.SIZE);
		
//		WrapperDemo obj = new WrapperDemo();
//		WrapperDemo obj2 = new WrapperDemo();
//		
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());
//		System.out.println(obj.equals(obj2));
		
//		int i=130;
//		int j= 258;
//		int k= 65536;
//		byte b= (byte)i;
//		System.out.println("b value: " + b);
//		
		int i=-135;
		byte b=(byte) i;
		String s="87";
		System.out.println((char)b);
		System.out.println(Byte.valueOf(b));
		System.out.println(Byte.valueOf(s));
		System.out.println(Byte.toString(b));
		
	}
}
