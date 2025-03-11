package com.mph;

class ThreadA{
	public synchronized void print1_5() {
		System.out.println("run started...");
		
			try {
				for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println("i = "+i);
			} 
		} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			System.out.println("run ends...");
			
		}
	}

class ThreadC extends Thread{
	ThreadA ta;
	public ThreadC(ThreadA ta) {
		this.ta=ta;
	}
	public void run() {
		ta.print1_5();
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts....");
		ThreadA ta1=new ThreadA();
		ThreadC tc1=new ThreadC(ta1);
		tc1.start();
		ThreadC tc2=new ThreadC(ta1);
		tc2.start();
		System.out.println("main ends...");
	}

}
