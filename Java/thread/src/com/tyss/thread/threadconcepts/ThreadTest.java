package com.tyss.thread.threadconcepts;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();

		test.start();
		test.start();

//		test.run();
//		test.run();
	}
}
