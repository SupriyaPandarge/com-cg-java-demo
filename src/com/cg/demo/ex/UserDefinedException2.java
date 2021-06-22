package com.cg.demo.ex;

class InvalidData extends Exception{
	public InvalidData(String s) {
		super(s);
	}
}

public class UserDefinedException2 {

	public static void main(String[] args) {
		int i,j;
		i=8;
		j=9;
		
		try {
			int k = i/j;
			if(k==0)
				throw new InvalidData("Input data is invalid");
			System.out.println(k);
		}
		catch(InvalidData e) {
			System.out.println("Error " +  e.getMessage());
		}
	}
}
