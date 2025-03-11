package com.mph;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {45,78,12,6,50};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		List l=new LinkedList();
		l.add(45);
		l.add(78);
		l.add(11);
		l.add(6);
		l.add(79);
		l.add(50);
		l.add(522);
	System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	
	Employee e1=new Employee(21,"ram");

	Employee e2=new Employee(10,"shiva");

	Employee e3=new Employee(6,"ravi");
	
	
	List elist=Arrays.asList(e1,e2,e3);
	System.out.println(elist);
	Collections.sort(elist);
	System.out.println(elist);
	
	Collections.sort(elist, Employee.nameComparator);
	
	}
}
