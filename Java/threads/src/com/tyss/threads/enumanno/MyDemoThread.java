package com.tyss.threads.enumanno;

public class MyDemoThread extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Thread "+ Thread.currentThread().getId()+" is running");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
