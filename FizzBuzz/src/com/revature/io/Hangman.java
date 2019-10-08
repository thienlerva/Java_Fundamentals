package com.revature.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
	
	/*
	 * Add business rules to game
	 * -- input validation
	 *  -- inly allow 5 incorrect guesses
	 *  --no duplicate guess
	 *  --loop to keep playing upon user request
	 *  --case insensive
	 *  --them game/separate by difficulty (optional)
	 *  --write to scroreboard
	 */
	
	static String wordFilePath = "src/com/revature/io/hangman_words.txt";
	
	public static void main(String[] args) {
		
		
		System.out.println("Hey there! Welcome to Java Hangman");
		
		// do some sort of validation to make sure that the word returned is not null
		
		boolean again = false;
		do {
		guess(getWord());
		System.out.println("Would you like to keep playing? Y/N");
		Scanner scan  = new Scanner(System.in);
		String ans = scan.nextLine();
		
		if(ans.equalsIgnoreCase("Y")) again = true;
		
		} 
		while(again);
		
		
	}
	
	//play guess game
	static void guess(String word) {
		
		char[] guessed = new char[word.length()];
		
		String wrong = "";
		
		for(char c : guessed) {
			c = ' ';
			
		}
		
		while(!String.valueOf(guessed).equals(word)) {
			
			if(wrong.length()==10) {
				System.out.println("Sorry! You are out of guesses! Your word was " + word);
				break;
			}
			printGuess(guessed);
			System.out.println("Guess a letter! :)");
			
			Scanner scan = new Scanner(System.in);
			String letter = scan.nextLine(); //do some input validation her to make sure input is 1 letter
			
			if(word.contains(letter)) {
				for(int i = 0; i < word.length(); i++) {
					if(word.charAt(i)==letter.charAt(0)) {
						guessed[i] = letter.charAt(0);
					}
				}
			} else if(wrong.contains(letter)) {
				System.out.println("You guessed");
			}
			
			else {
				wrong += letter + " ";
				System.out.println("WRONG! Your incorrect guesses are ");
			}
			
		}
		
	}
	
	static void printGuess(char[] letters) {
		
		System.out.println("GUESS: ");
		
		for(char c : letters) {
			System.out.println(c + " ");
		}
		System.out.println();
	}
	
	//get random word from text file
	static String getWord() {
		
		ArrayList<String> words = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(wordFilePath));) {
			
			String line = null;
			while((line=br.readLine())!=null) {
				words.add(line);
			}
			
			int randomNum = (int) (Math.random() * words.size()-1);
			
			return words.get(randomNum);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

}
