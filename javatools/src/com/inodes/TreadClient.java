package com.inodes;

public class TreadClient {
	private int i;
	
	private synchronized void inc(){
		i++;
	}
	
	private synchronized void dec(){
		i--;
	}

	class Dec implements Runnable{

		@Override
		public void run() {
			inc();
			System.out.println(Thread.currentThread().getName()+"---inc---    "+i);
		}
		
	}

	class Inc implements Runnable{

		@Override
		public void run() {
			
			dec();
			System.out.println(Thread.currentThread().getName()+"---dec---    "+i);
		}
		
	}
	
	public static void main(String[] args) {
		TreadClient t = new TreadClient();
		Inc inc = t.new Inc();
		Dec dec = t.new Dec();
		
		for (int i = 0; i < 2; i++) {
			new Thread(inc).start();
			new Thread(dec).start();
		}
	}
}


