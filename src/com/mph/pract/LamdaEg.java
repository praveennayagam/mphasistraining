package com.mph.pract;
                           // -- java 8 syntax for functional interface using lamda expression
interface Calculate{
	public int add(int a,int b);  // abstract method
}

public class LamdaEg {
	public static void main(String[] args) {
		Calculate res=(a,b)->{
			return a+b;
		};
		System.out.println(res.add(6, 8));
	}
	
}
   // ---java 7 function calling ....
// public class e3 {

//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	int x=5;
//	e3 p=new e3();
//	p.doSt(x);
//	System.out.println(x);
//
//}
//void doSt(int x) {
//	System.out.println(x++);
//}
