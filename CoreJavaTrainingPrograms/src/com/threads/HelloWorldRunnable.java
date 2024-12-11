package com.threads;

public class HelloWorldRunnable implements Runnable{

	public HelloWorldRunnable() {
		
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("i "+i+" "+Thread.currentThread());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("In Main Thread: "+Thread.currentThread());
		HelloWorldRunnable runnable = new HelloWorldRunnable();
		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.setName("One");
		thread1.setName("Two");
		thread1.start(); // start method will schedule the thread
		thread2.start();
		//main to wait
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main is completed");
	}
}
