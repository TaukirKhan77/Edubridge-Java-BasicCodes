package com.edu;

class MyClass extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("run method "+Thread.currentThread()+" "+i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
public class MainAppThread {
	

	public static void main(String[] args) throws InterruptedException {
		System.out.println("JVM Thread "+Thread.currentThread());
		MyClass obj = new MyClass();
		obj.setName("first");
		
		MyClass obj1 = new MyClass();
		obj1.setName("Second");
		obj.start();
		obj.join();
		obj1.start(); //Thread cannot be started more than once
		//obj.start(); //shows java.lang.IllegalThreadStateException
	}


}