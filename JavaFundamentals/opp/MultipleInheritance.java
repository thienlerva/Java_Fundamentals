package com.revature.opp;

public class MultipleInheritance implements A, B {
	
	/*
	 * Methods in interfaces are implicitly public and abstract.
	 * In order to implement methods in interfaces you must apply the default keyword
	 * 
	 * Implementing two methods with the same default method will make your class not compile
	 * unless you override the method in question within the class
	 */
	
	public static void main(String[] args) {
		
		MultipleInheritance m = new MultipleInheritance();
		m.test();
	}
	
	@Override
	public void doAThings() {
		
	}
	
	@Override
	public void test() {
		A.super.test();
	}
	
	@Override
	public void doBThings() {
		
	}
	

}

interface A{
	
	void doAThings();
	
	default void test() {
		System.out.println("I am the test method of interface A");
	}
	
}

interface B{
	
	void doBThings();
	
	default void test() {
		System.out.println("I am the test method of interface B");
	}
	
}

