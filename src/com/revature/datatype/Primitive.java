package com.revature.datatype; // fist line of any java class

public class Primitive {

	int a;  // number type - 4 bytes 
	boolean b; // T/F
	char c;  // %afd343' - 2 bytes
	long e; //
	double d; // decimal - 8 bytes
	float f; // flating decimal - 4 bytes
	long w; // large numer - 8 bytes
	short g; // small numbers - 2 bytes
	byte h; // //1byte
	
	// 1 byte = 8 bits (00000000)
	
	public static void main(String[] args) {
		
		int x; // declaring x
		x = 5; // initiize x
		x = 10; // reassining x
		
		//int x = 100; cannot redeclare var in same scope
		
		int imRich = 10_000_000;
		// int test = _1_0000_;
		
		double num = 100_000.00;
		//double test = 100._00;
		
		boolean namingConventionIsCamelCase = true;
		boolean $works = true;
		boolean is_Good$ = false;
		
		//Casting-changing the reference type of your entity(primitive or object)
		
		int number = 1000000000;
		short smallNum = (short) number; //Large -> small = Explicit
		
		long largeNum = smallNum; //Small -> Lagre = Implicit
		
		// Wrapper classes - classes that give object functionality to primitives
		//can be initialize via boxing or instantiation
		
		Integer wrapA = number;
		char ch = 'a';
		Character wrapChar = ch; //boxing char ch into its wrapper class 
		Double wrapDouble = 10.09;
		Float wrapFloat = new Float(99.01);
		float flo = wrapFloat; // unboxing wrapper class value into primitive value
		Boolean wrapBool = new Boolean(false);
		
		//Double testNum = (Double) wrapFloat;
		
		double testD = 10.0;
		float t = (float) testD; // primitive casting is more flexible than object casting
		
		System.out.println(Integer.MAX_VALUE);  // just one of many things wrapper clase expose
		System.out.println();
		
		long isLong = 10000000000000000L;// lowercase l or uppercaseL
		
		//Base
		int base10 = 1012341;
		System.out.println(base10);
		//Binary 0 - 1
		int base2 = 0b101;
		int moreBinary = 0B10101;
		System.out.println(base2);
		
		//Octal- 0 -7
		int base8 = 01274;
		System.out.println(base8);
		
		//Hexadecimal - 0 - 9, a-f
		int base16 = 0x10bc34;
		System.out.println(base16);
	}
	
	
	
}
