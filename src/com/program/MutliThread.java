package com.program;

class practice1 extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			//System.out.println("1");
			System.out.println("1 = "+Thread.currentThread().getName());
			//System.out.println("Run 1 - "+i);
			System.out.println("1 = "+Thread.currentThread().getPriority());
		}
	}
}


class practice2 extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			Thread.currentThread().setPriority(10);
			//System.out.println("2");
			System.out.println("2 = "+Thread.currentThread().getName());
			//System.out.println("Run 2 - "+i);
			System.out.println("2 = "+Thread.currentThread().getPriority());
		}
	}
}

class MutliThread {
	public static void main(String[] args) {
		practice1 t1 = new practice1();
		t1.setName("Prem-thread");
		t1.start();
		
		practice2 t2 = new practice2();
		t2.start();
		
		System.out.println("main = "+Thread.currentThread().getPriority());
	}
}