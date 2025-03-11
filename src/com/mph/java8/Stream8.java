package com.mph.java8;
import java.util.*;
import java.util.stream.Collectors;
public class Stream8 {

	public static void main(String[] args) {
		List <String> strl=Arrays.asList("rat","cat","mat","","lion","elephant","tiger");
		
		long slist=strl.stream().filter(str -> str.isEmpty()).count();
		System.out.println("list with empty str "+slist);
		
		
		
		List<Integer> intlist=Arrays.asList(1,1,2,3,4,5,6,7,8,9);
		System.out.println(intlist);
		intlist.stream().sorted().distinct().forEach(System.out::println);
		IntSummaryStatistics stat=intlist.stream().mapToInt(num -> num).summaryStatistics();
		System.out.println("max "+stat.getMax());
		System.out.println("min "+stat.getMin());
		System.out.println("sum "+stat.getSum());
		System.out.println("count "+stat.getCount());
		System.out.println("avg "+stat.getAverage());
	}

}
