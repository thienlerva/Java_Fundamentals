package com.revature.designpatterns;

public class Driver {
	
	/**
	 * 
	 * Design patterns are established general solutions to commonly occuring software development
	 * problems.
	 */
	
	public static void main(String[] args) {
		
		//singletonDemo();
		
		factoryDemo("cake");
		factoryDemo("brownie");
		factoryDemo("I really love dessert");
		
	}
	
	static void factoryDemo(String dessertType) {
		Dessert d = DessertFactory.getDessert(dessertType);
		System.out.println(d.makeMe());
	}
	
	
	static void singletonDemo() {
		
		//Singleton s1 = new Singleton // WILL not compile
//		Singleton s1 = Singleton.getInstance();
//		
//		s1.setName("first singleton instance");
//			
//		Singleton s2 = Singleton.getInstance();
//		
//		s2.setName("Second single reference");
//		
//		System.out.println(s1.getName());
		
		Singleton.test();
		LazySingleton.test();
	}

}
