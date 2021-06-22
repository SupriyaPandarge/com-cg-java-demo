package com.cg.demo.ios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("sample.txt"));
		DataInputStream dis = new DataInputStream(new FileInputStream("sample.txt"));
		dos.writeInt(1234);
		int i = dis.readInt();
		System.out.println(i);
		dos.close();
		dis.close();
	}
}
