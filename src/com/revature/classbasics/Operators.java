package com.revature.classbasics;

public class Operators {
	
	/*
	 * An opeator in Java is a special symbol that can be applied
	 * to a set of variables, values, or literals -
	 * referred to as operands - and that returns a result
	 * 
	 * There are unary, binay, and ternary operators, with 1, 2
	 * and 3 operands, repestively
	 */
	
	public static void main(String[] args) {
		
		System.out.println(postIncrement(4));
		System.out.println(preIncrement(4));
		
		testUnary(4);
		
		System.out.println(leftShift(212, 1));
		
		Object o = new Integer(5);
		System.out.println(relational(0));
		
		Object a = new String("This is a string");
		System.out.println(relational(a));
		
		System.out.println(bitwiseOr(12, 25));
		
	}
	
	// Unary
	
	
	// Post-unary operators
	
	//First - increment/decrement
	public static boolean postIncrement(int count) {
		
		return count++ == 5;
	}
	
	static boolean preIncrement(int count) {
		return ++count == 5;
	}
	
	static void decrement(int count) {
		--count; //pre
		count--; //post
	}
	
	static void testUnary(int count) {
		if ( count++ < 5) {
			System.out.println(count);
		}
	}
	
	// two's complement ==> n = -(n + 1)
	static int complement(int x) {
		return ~x;
	}
	
	
	//The from left to right
	static int negate(int x) {
		return -x;
	}
	
	static boolean opposite(boolean exp) {
		return !exp;
	}
	
	static int positive(int x) {
		return +x;
	}
	
	//NEXT, BINARY, from left to right firt add, substract then *, /, %
	static void binary(int a, int b) {
		int x = a + b;
		x = a -b;
		x = a /b;
		x = a*b;
		x = a%b;
	}
	
	//THEN BITSHIFT
	// >> << >>>
	
	/*
	 * Signed Left shif
	 * Shift a bit pattern(left operand) by a certain number(right operand)
	 * of bits to the left
	 * 
	 *  212 = 11010100
	 *  212 << 110101000 = 424
	 */
	static int leftShift(int num, int shift) {
		return num << shift;
	}
	
	//THEN RELATIONAL > < >= <= instance of
	static boolean relational(Object obj) {
		if (obj instanceof Object) return true;
		else return false;

	}
	
	//THEN Equals
	public boolean equalTo(int a, int b) {
		if (a==b) return true;
		else if (a!=b) return false;
		else return false;
	}
	
	/*BITWISE &, |, ^
	  these operators compare the corresponding bits of the operands
	  
	  ex
	     12 -> 001100 |
	     25 -> 011001
	        =  011101
	*/
	static int bitwiseOr(int a, int b) {
		return a | b;
	}
	
	//SHORT CIRCUIT
	public String shortCircuit(boolean first, boolean second) {
		
		//if(x++=5 && y-- == x)
		if (first && second) {
			return "if first is false, the second operand isnot valuuated" +
		    "because there is no way that the entire expression " +
					" can be true regardless of whether or not the second" +
		    "operand is true";
		}
		else if(first || second) {
			return "if firs is true, the expression is automatically true" +
		" regarless of value of second, so second is not evalued" +
					"if first is false, truthiness of entire expressin depends"
+ "on second, so it is evalued";
			
		} else return "both are false";
	}
	
	// Ternary operators
	// 3 operands
	// [expression] ? [val for T] : [val for F]
	static String ternary(int x) {
		return x>0 ? "X is greater than 0" : "X is less than 0";
	}
	
	static void moreTern(boolean cond, int x) {
		String testing = cond ? (x > 6 ? "op1" : "op2") : "op3";
	}
	
	static void toBinary(int num) {
		//take number as base10 print out as binary
		Integer.toBinaryString(num);
	}

}
