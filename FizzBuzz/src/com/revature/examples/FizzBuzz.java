package com.revature.examples;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		fizzBuzz(16);
		
	}
	
	public static void fizzBuzz(int num) {
		
		for(int i = 0; i <= num; i++) {
			
			if(i%15==0) System.out.println("fizzBuzz");
			
			else if(i%5==0) System.out.println("Buzz");
			else if(i%3==0) System.out.println("fizz");
			else System.out.println(i);
		}
	}

}
