package com.mph;

class ThreadB implements Runnable{
	public void run() {
		System.out.println("run start...");
		try {
			for(int i=1;i<=5;i++) {
				Thread.sleep(1000);
				System.out.println(i+" ");
			}
		
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		System.out.println("run ends...");
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts....");
		ThreadB tb=new ThreadB();
		Thread t=new Thread(tb);
		t.start();
		System.out.println("main ends...");
	}

}
