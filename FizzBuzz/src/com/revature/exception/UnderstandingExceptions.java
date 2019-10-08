package com.revature.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UnderstandingExceptions {
	
	public static void main(String[] args) {
		
		
//		try {
//			test();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			throwCustom();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void test() throws IOException {
		
		try {
			int x = 2 +2;
			throw new IOException();
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		
		//unreadchable code
//		catch(NumberFormatException nfe) {
//			
//		}
	}
	
	static void tryWithResourcesExample() {
		//to write to file, we use bufferewriter and fileWriter
		
		String filename = "test";
		
		/*
		 * Try-with-resources, added to the Java API since 1.7 is intended to avoid need for 
		 * finally block to close resources. This can ONLY be implemented with objects
		 * that implement the AutoCloseable Interface
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
				BufferedReader br = new BufferedReader(new FileReader(filename));) {
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void throwCustom() throws MyException {
		
	
			
			//risky code
			//sth goes wrong
			throw new MyException("hey this is an exception message");
			
		
	}
	
	static void throwCustomAgain() throws MyException {
		
		throw new MyException();
	}

}
