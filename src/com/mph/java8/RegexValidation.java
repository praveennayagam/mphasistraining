package com.mph.java8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		String emailPattern="^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		boolean isValid=Pattern.matches( emailPattern,email);
		System.out.println("is valid email? "+isValid);

	}

}
