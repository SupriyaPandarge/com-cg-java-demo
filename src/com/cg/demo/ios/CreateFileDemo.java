package com.cg.demo.ios;
import java.io.*;

public class CreateFileDemo {

	public static void main(String[] args) {
		
		try {
			File file = new File("E:\\Java prgrm\\myFile1.txt");
			boolean fileCheck;
			fileCheck = file.createNewFile();
			if (fileCheck == true) {
				System.out.println("file created");
			}else {
				System.out.println("File already present");
			}
		} catch (IOException e) {
			System.out.println("Something went wrong");
		}
		
	}
}
