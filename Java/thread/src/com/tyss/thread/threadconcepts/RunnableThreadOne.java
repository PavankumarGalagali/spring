package com.tyss.thread.threadconcepts;

public class RunnableThreadOne implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread One"+Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}

}
