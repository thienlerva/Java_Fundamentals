package com.ex.threads;

public class ImplementsRunnable implements Runnable {

	
	public void run() {
		
		for(int i = 0; i < 20 ; i++) {
			System.out.println(i + ")IN IMPLEMENTS RUNNABLE RUN()");
		}
	}
}
