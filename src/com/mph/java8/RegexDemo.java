package com.mph.java8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		 
		String regex="\\d+";
		String ip="The price is 250 rupees.";
		
		Pattern p= Pattern.compile(regex);
		Matcher m=p.matcher(ip);
		while(m.find()) {
			System.out.println("Found:"+m.group());
		}
}

}
