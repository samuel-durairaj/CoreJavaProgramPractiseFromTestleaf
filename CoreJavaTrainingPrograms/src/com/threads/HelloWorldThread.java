package com.threads;

public class HelloWorldThread extends Thread {

	//int count = 10; - Instance variable are shared by threads, so we use the keyword 'volatile'
	public HelloWorldThread(String threadName) {
		setName(threadName);
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
		HelloWorldThread thread1 = new HelloWorldThread("one");
		HelloWorldThread thread2 = new HelloWorldThread("two");
		thread1.start(); // start method will schedule the thread
		thread2.start();
	}
}
