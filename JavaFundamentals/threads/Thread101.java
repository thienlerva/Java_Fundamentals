package com.ex.threads;

public class Thread101 {
	
	/*
	 * Thread - single path of execution
	 * Multithreading - the process of creating multiple flows of control in program execution.
	 * 
	 * There is always at least one thread in an application. The main() method excutes on the main thread.
	 * We can spin up separate threads of execution by either implementing the Runnable interface or extending
	 * the thread class
	 * 
	 * JVM determines when no more user threads are active
	 * 
	 * Thread States:
	 * New - thread is new
	 * Runnable - thread is ready to run (may already be running, or is ready to run at any time)
	 * Blocked - aka waiting state. When a thread is temporarily inactive. A thread is in the blocked 
	 * state when it tries to access a protected(synchronized) section of code that is currently locked
	 * in another thread.
	 * Waiting - threads can be made to wait for a specified amount of time.
	 * Terminated - a thread terminates either because it completes its task naturally or some exceptional
	 * event occurs.
	 * 
	 * Related topics: Object class 
	 */
	
	public static void main(String[] args) {
		
		//main thread
		
		ExtendsThread et = new ExtendsThread();
		
		ExtendsThread et2 = new ExtendsThread();
		
		et.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(et.getState());
		
		et.start();
		
		ImplementsRunnable ir = new ImplementsRunnable();
		
		//Creates a thread (so we can actually start() it with run()
		//functionality of the runnable object created.
		
		Thread it = new Thread(ir);
		
		it.start();
		
		System.out.println(et.getState());
		
		for(int i =0; i < 20; i++) {
			System.out.println(i + ") IN MAIN THREAD");
		}
		
		
		//LAMBDA INTRO
		//this variable lambda is an instance of a class that implements Runnable
		
		Runnable lambda = () -> {
			
			// IMPLEMENTING RUN METHOD OF RUNNABLE INTERFACE WITHOUT CREATING NEW CLASS
			
			for(int i =0; i < 20; i++) {
				System.out.println(i + ") IN LAMBDA THREAD");
			}
		};
		
		Thread lamThread = new Thread(lambda);
		lamThread.start();
		
		
		//ANONYMOUS CLASSES
		//anon var is an instance of an ANONYMOUS (not named) class that extends thread
		
		Thread anon = new Thread() {
		
		public void run() {
			
			
		}
		
		public synchronized void test() {
			
			System.out.println("In test method of anonymous class");
			
		}};
				
		
			
		
		
	
	}

}
