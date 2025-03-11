package com.mph;

public class Threads5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			public void run() {
				System.out.print("bar");
			}
		}).start();
	}

}
