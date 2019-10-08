package com.revature.datatype;

public class UnderstandingStrings {

	public static void main(String[] args) {
		
		String a = "hello";
		String b = new String("hello");
		String c = "hello";
		String d = new String();
		
		System.out.println(a==c);
		System.out.println(a.equals(b));
		System.out.println(d.equals(""));
		
		a = a.concat(" world");
		
		System.out.println(a.startsWith("w"));
		System.out.println(a.charAt(4));
		System.out.println(a.substring(5));
		System.out.println(a.substring(5, 7));
		System.out.println(a.lastIndexOf('l'));
		
		// CANNOT initialize like string, ie StringBuilder sb = "builder"
		
		StringBuilder sBuild = new StringBuilder(a);
		sBuild.append(" -- building a string");
		System.out.println(sBuild);
		sBuild.reverse();
		System.out.println(sBuild);
		
		StringBuilder sb = new StringBuilder();
		
		
		StringBuffer sBuff = new StringBuffer("This is a string buffer");
		
	}
	
	// turn decimal number to binay
	static StringBuilder toBinay(int x) {
		String out = "";
		while (x >0) {
			out += x%2;
			x/=2;
		}
		StringBuilder sb = new StringBuilder(out);
		return sb.reverse();
	}
}
