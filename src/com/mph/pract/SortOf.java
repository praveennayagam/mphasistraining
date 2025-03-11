package com.mph.pract;

import java.util.ArrayList;
import java.util.Collections;

public class SortOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> a=new ArrayList<Integer>();
			a.add(1);
			a.add(5);
			a.add(3);
			
			Collections.sort(a);
			a.add(2);
			Collections.reverse(a);
	
			
	}

}
