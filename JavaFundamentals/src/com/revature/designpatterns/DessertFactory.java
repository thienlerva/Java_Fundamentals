package com.revature.designpatterns;

/*
 * The factory design pattern is a pattern which creates objects where the precise type
 * may not be known until runtime (create a reference to a parent class or interface but instantiate
 * with the particular implementing class based on some sort of user input)
 * 
 * To make a factory we need:
 * -abstract data type
 * -classes which inherit the abstract data type
 * -static method that returns a concrete instance of the abstract data type
 */

public class DessertFactory {

	
	public static Dessert getDessert(String type) {
		
		switch(type) {
		case "cake":
			return new Cake();
		case "cookie":
			return new Cookie();
		case "brownie":
			return new Brownie();
		default:
			throw new DessertNotFoundException();
		}
	}
}

//Good pracete to throw an exception
class DessertNotFoundException extends RuntimeException {
	
	
}

//abstract type
interface Dessert{
	String makeMe();
}

class Cake implements Dessert{
	
	public String makeMe() {
		return "bake a cake with lots of sugar and things";
	}
}

class Cookie implements Dessert{
	
	public String makeMe() {
		return "Chocolate chip";
	}
}

class Brownie implements Dessert{
	
	public String makeMe() {
		return "yum";
	}
}
