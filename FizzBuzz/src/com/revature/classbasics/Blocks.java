package com.revature.classbasics;
import java.time.LocalDateTime;

public class Blocks {
	
	LocalDateTime time;
	
	static {
		System.out.println("In block before main");
		
	}
	
	{
		System.out.println("In Nonstatic block before main");
		time = java.time.LocalDateTime.now();
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("In main method");
		Blocks b = new Blocks();
		System.out.println(b.time);
	}
	
	static {
		System.out.println("In Static block after main");
	}
	
	{
		System.out.println("In non static block after main");
	}

}
