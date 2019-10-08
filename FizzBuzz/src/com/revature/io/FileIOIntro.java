package com.revature.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
 * Some of the many tools that can be used to read from and write to files are
 * BufferedReader/Writer and FileReader/Writer of the java.io package
 */

public class FileIOIntro {
	
	public static void main(String[] args) {
		
		//write("appending to file");
		
		System.out.println(read());
	}
	
	
	
	public static void write(String text) {
		
		/*
		 * TRY-WITH-RESOURCES -> parameterized try block. Can only be used with resources
		 * that implement the Autocloseable interface so that you do not need a finally
		 * block to close the resource.
		 */
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/revature/io/text.txt", true));) {
			
			bw.write(text + "\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String read() {
		
		String text = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader("text.txt"));) {
			
			
			String line = null;
			while((line = br.readLine())!=null) {
				
				text += line + "\n";
			}
			
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		return text;
	}

}
