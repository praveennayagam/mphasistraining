package com.mph;

import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new LinkedList();
		l.add("Praveen");
		l.add("Ram");
		l.add(11);
		l.add("true");
		l.add(null);
		l.add(null);
		l.add(5.34);
		//System.out.println(l);
		Iterator i =l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		Set s=new HashSet();
		s.add("Praveen");
		s.add("Praveen");
		s.add(11);
		s.add("true");
		s.add(null);
		s.add(null);
		s.add(5.34);
		//System.out.println(s);
		
		Iterator is =l.iterator();
		while(is.hasNext()) {
			System.out.println(is.next());
		}
		
		Map m=new HashMap();
		m.put(1,"Praveen");
		m.put(2,"Praveen");
		m.put(3,null);
		m.put(4,"true");
		m.put(4,5.34);
		m.put(null, 678);
		m.put(null, 7890);
		m.put(7, l);
		//System.out.println(m);
		Collection c=m.values();
		Iterator im =c.iterator();
		while(im.hasNext()) {
			System.out.println(im.next());
		}
		
		
	}

}
