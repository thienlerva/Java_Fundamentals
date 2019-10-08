package com.revature.examples;

class Baap {
	public int h = 4;
	
	public int getH() {
		System.out.println("Baap " + h);
		return h;
	}
}
public class Beta extends Baap{
	
	public int h = 44;

	public int getH() {
		System.out.println("Beta " + h);
		return h;
	}
	
	public static void main(String[] args) {
		
		Baap b = new Beta(); //upcasting Beta object behave like parent object Baap
		System.out.println(b.h + " " + b.getH());
		Beta bb = (Beta) b; //Downcasting
		System.out.println(bb.h + " " + bb.getH());
		
		System.out.println();
		
	}
	
}


