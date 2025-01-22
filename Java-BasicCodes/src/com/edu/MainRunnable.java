package com.edu;

class Third implements Runnable{


	@Override
	public void run() {
		System.out.println("indside run method "+Thread.currentThread());
		
	}
	
}


public class MainRunnable {
	class Third implements Runnable{


		@Override
		public void run() {
			System.out.println("indside run method "+Thread.currentThread());
			
		}
		
	}



}
