package com.revature.junit;

public class Methods {
	
	
	//add(1,2) = 3
	//add(1,2,3,4324,4559)
	//add()
	//add([])
	//NOT add([1, 2 , 5 ,6])
	
	/*
	 * VAR ARGS
	 * -variable number of arguments of a specific type
	 * - reference these args in the method as if it were an array
	 * - MUST be the last argument in a method
	 * - only allowed to have one var ars per method
	 */
	public int add(int... nums) {
		
		int total = 0;
		
		for(int i : nums) {
			total += i;
		}
		
		return total;
	}
	
	public boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		
		return sb.reverse().toString().equals(str);
	}

}
