package com.cg.demo.ios;

import java.io.File;

public class RenameFileDemo {

	public static void main(String[] args) {
		File oldfile = new File("E:\\Java prgrm\\myFile1.txt");
		File newfile = new File("E:\\Java prgrm\\newFile1.txt");
		boolean flag = oldfile.renameTo(newfile);
		if(flag) {
			System.out.println("file renamed");
		}else {
			System.out.println("file could not be renamed");
		}
	}
}
