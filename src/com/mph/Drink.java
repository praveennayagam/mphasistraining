package com.mph;

import java.util.*;

//public class Drink {
	public  class Drink implements Comparable{
	public String  name;
	public int compareTo(Drink o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	//}




public static void main(String[] args) {
	
	Drink one=new Drink();
	Drink two=new Drink();
	one.name="coffe";
	two.name="tea";
	TreeSet set=new TreeSet();
	set.add(one);
	set.add(two);
	System.out.println(set.toString());
}



@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 1;
}

}
