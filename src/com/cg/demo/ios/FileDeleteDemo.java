package com.cg.demo.ios;

import java.io.File;

public class FileDeleteDemo {

	public static void main(String[] args) {
		try {
		File file = new File("E:\\Java prgrm\\newFile1.txt");
		if(file.delete()) {
			System.out.println(file.getName()+ " deleted");
			
		}else {
			System.out.println("file not deleted");
		}
	}catch(Exception e) {
		System.out.println("something went wrong");
	}
}
}
