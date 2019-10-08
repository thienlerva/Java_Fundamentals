package com.revature.datatype;

public class PrimTest {
	
	public static void main(String[] args) {
		int total = 0;
		
		for (String s : args) {
			// for each string
			int num = Integer.parseInt(s); // not considered casting sinc it string
			total = total + num;
		}
		
		System.out.println(total);
	}
	
	

}
