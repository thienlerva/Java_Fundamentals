package com.revature.classbasics;

public class Scopes {
	
	/*
	 * variable scopes refer to the lifetime of accessibility
	 * of a variable
	 * 
	 * there are 4 scopes
	 * 
	 * class/static (var, methods, nest classes) - accessible
	 * from outside of the class without an instance ie. Class.x or Class.method();
	 * 
	 * Regarding static variables, these values are shared throughout
	 * any instances of the class
	 * class Test {static int count=0;}
	 * 
	 * from outside test;
	 * 
	 * Test c = new Test();
	 * Test c2 = new Test();
	 * c.count = 10;
	 * .then c2.count would also be 10;
	 * 
	 * object/instance - the particular instance of the objects
	 * state and behavior
	 * Class c = new Class();
	 * c.x; or c.method();
	 * 
	 * method/local - parameters for method and any variable declare within the method
	 * 
	 * block/loop - any variable defined in curly braces or in the () before loop
	 */
	
	int instanceVar ;
	static int staticInt ;
	static double statDoub;
	static char statChar;
	static float statFloat;
	static boolean statBool;
	static byte statByte;
	static long statLong;
	static String statString;
	static Integer statWrapper;
	
	public static void main(String[] args) {
		
		int methodScope;
		
		Scopes s = new Scopes();
		
		
		//method and block scope vars must be initialized to use
		//System.out.println(methodScope);
		System.out.println(s.staticInt);
		System.out.println(s.instanceVar);
		System.out.println("int default: " + staticInt);
		System.out.println("char default: " + statChar);
		System.out.println("float default: " + statFloat);
		System.out.println("String default: " + statString);
		System.out.println("Integer default: " + statWrapper);
		
		/*
		 * in order to access an instance method or variable from inside of a static method
		 * we must instantiate the class within the class itself. from there we can access its instance
		 * fields.
		 */
		//Scopes s = new Scopes();
		s.testingInstance();
	}
	
	void testingInstance() {
		System.out.println("instance method");
	}
	
	static void testStatic() {
		
	}

}
