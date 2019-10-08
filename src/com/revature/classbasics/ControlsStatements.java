package com.revature.classbasics;

public class ControlsStatements {
	
	/*
	 * outside of loops - important to know are continue, break
	 * and labels
	 */
	
	public static void main(String[] args) {
		
	int i = 2;
	
	for ( ; ;) {
		if (i%2==0) {i=i+2;}
		else i = i +3;
		
		System.out.println(i);
		
		if(i==20) break;
	}
	
	String str = "this is a long string";
	for(int x = 0; x < str.length(); x++) {
		if(str.charAt(x)!=' ') {
			System.out.println(str.charAt(x));
		}
	}
	
	int[][] twoD = new int[5][4];
	int counter = 0;
	for(int j = 0; j < twoD.length; j++) {
		for(int k = 0; k < twoD[j].length; k++) {
			twoD[j][k] = counter++;
			System.out.print(twoD[j][k] + " ");
		}
		System.out.println();
	}
	
	//For each - "enhanced for loops"
	// at runtime, get coverted behind the scenes to a regular for loop
	//used to iterate over arrays or collections
	String[] strings = {"This is a string", "another String", "i'm hungry"};
	
	for (String s : strings) {
		System.out.println(s.replaceAll(" ", "---"));
	}
	
	
	int x = 0;
	while (x< 5) {
		System.out.println(x);
		x++;
	}
	
	
	}

}
