package com.cg.demo.ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
// READ DATA FROM FILE USING FILE READER
public class CharDemo {
	
	public static void main(String[] args) throws Exception {
	FileReader fr = new FileReader("sample.txt");
	int i;
	while((i=fr.read())!= -1)
		System.out.print((char) i);
	fr.close();
}
}
