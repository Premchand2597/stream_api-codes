package com.program;

public class MultiThread2 extends Thread{
    public static StringBuilder sb = new StringBuilder("A");

    @Override
    public void run() {
        for(int i=0; i<3; i++) {
            sb.append("X");
        }
    }

    public static void main(String[] args) throws InterruptedException {
    	MultiThread2 t1 = new MultiThread2();
    	MultiThread2 t2 = new MultiThread2();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        System.out.println(sb);
    }
}
