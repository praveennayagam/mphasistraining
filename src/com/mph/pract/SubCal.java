package com.mph.pract;
class SuperCal{
	protected static int mul(int a,int b) {
		return a*b;
	}
}
public class SubCal extends SuperCal {
public static int mul(int a,int b)
{
	//int c=super.mul(a,b);
	return a*b;
}

public static void main(String[] args) {
	SubCal sc=new SubCal();
	System.out.println(sc.mul(3, 4));
	System.out.println(SubCal.mul(4, 5));
}
}
