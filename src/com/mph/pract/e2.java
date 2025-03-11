package com.mph.pract;

public class e2 {
	int sq=81;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new e2().go();
		

	}
	void go() {
		inc(++sq);
	System.out.println(sq);
	}
	void inc (int sq) {
		sq+=10;
		//System.out.print(sq);
	}

}
