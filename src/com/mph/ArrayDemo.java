package com.mph;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6,7,8,9};
		int arr[]=new int[3];
		 arr[0]=100;
		 arr[1]=200;
		 arr[2]=300;
	 System.out.println(Arrays.toString(a));
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 for(int in : arr) {
			 System.out.println(in);
		 }
		// Employee e1=new Employee();
//		 e1.setEmpno(1);
//		 e1.setEname("praveen");
		// Employee e2=new Employee();
//		 e2.setEmpno(2);
//		 e2.setEname("saravana");
		// Employee e3=new Employee();
//		 e3.setEmpno(3);
//		 e3.setEname("Barath");
		 
//		 Employee [] empArr= {e1,e2,e3};
//		 for(Employee earr : empArr) {
//			 System.out.println(earr);
//		 }
	}

}
