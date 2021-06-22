package com.cg.demo.ios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:\\Java prgrm\\myFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String str ="supriya";
		bw.write(str);
		System.out.println("Text written to file");
		bw.close();
	}
}
