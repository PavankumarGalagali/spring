package com.tyss.threads.common;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(" started ");
//		FirstThread firstThread = new FirstThread();
//		SecondThread secondThread = new SecondThread();
//		
//		firstThread.start();
//		secondThread.start();
		
		RunnableThreadOne one = new RunnableThreadOne();
		RunnableThreadTwo runnableThreadTwo = new RunnableThreadTwo();
		
		Thread thread = new  Thread(one);
		Thread thread2 = new Thread(runnableThreadTwo);
		System.out.println(Thread.currentThread().getName());
		thread.start();
		thread2.start();
	
		System.out.println(" Ended ");
	}
}
