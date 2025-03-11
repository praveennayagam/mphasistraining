package com.mph;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		String s2= new String("java");
		String s3="I*Love*Java";
		String s4="java";
		String s5=null;
			String []s=s3.split("\\s+");
			for(String str: s) {
				System.out.println(str);
			}
		
	}

}
