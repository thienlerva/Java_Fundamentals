package com.revature.io;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;
// Static imports allow us to refer to static fields of a class without the class name
import com.revature.pojos.*;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		System.out.println(addNums());

	}
	
	public static void runGreeting() {
		
		//java.util.Scanner s = new java.util.Scanner(System.in)
				Scanner scan = new Scanner(in);
				
				//also utilizing static imports here
				out.println("What is your name? ");
				String name = scan.nextLine();
				System.out.println("What do you do for fun?");
				String hobby = scan.nextLine();
				
				
				out.println("How old are you?");
				
				int age = 0;
				
				try {
					age = scan.nextInt(); //must validated
					Person p = new Person(name, hobby, age);
					
					System.out.println(p); //toString();
				} catch(InputMismatchException e) {
					System.out.println("I need number");
					
					runGreeting();
					//e.printStackTrace();
				}
				
				finally { // Finally blocks - close opened resources
					scan.close();
				}
				
	}
	
	public static int addNums() {
		
		Scanner scan = new Scanner(in);
		
		System.out.println("enter number you would like to add?");
		String nums = scan.nextLine();
		String[] numArr = nums.split(" ");
		int total = 0;
		for(String s : numArr) {
			total += Integer.parseInt(s);
		}
		
		return total;
	}

}
