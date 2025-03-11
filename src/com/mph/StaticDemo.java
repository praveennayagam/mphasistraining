  package com.mph;
class First {
	int x=30;
	static int y=40;
	static class InnerClass{}
	public void rm() {
		System.out.println("x "+  ++x);
		System.out.println("y "+  ++y) ;
	}
	public static void sm() {
		//System.out.println("x"+  x);
		System.out.println("static y " + y);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First s1=new First();
		s1.rm();
		First s2=new First();
		First.sm();
	}

}
