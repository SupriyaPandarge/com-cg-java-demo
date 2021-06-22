package com.cg.demo.ios;

import java.io.FileWriter;
import java.io.IOException;

// WRITE DATA TO FILE USING FILE WRITER
public class CharDemo2 {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("sample.txt");
			fw.write("sample text 2");
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("done");
		
	}
}
