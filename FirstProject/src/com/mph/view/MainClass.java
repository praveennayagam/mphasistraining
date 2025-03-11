package com.mph.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.mph.UserNotFoundException;
import com.mph.controller.EmployeeController;

public class MainClass  {

	public static void main(String[] args) throws Exception {
	try {	
		
		String un=null,pwd=null;
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter username");
		un = br.readLine();
		System.out.println("enter password");
		pwd = br.readLine();
		
		BiPredicate<String, String> p = (username, password) -> 
          username.equals("Praveen") && password.equals("pass");
		
		if(p.test(un,pwd)) {
			System.out.println("welcome "+ un);
		//	System.out.println("Welcome");
			EmployeeController ec = new EmployeeController();
			
			Scanner sc = new Scanner(System.in);
			String ch = "";
			do {
				System.out.println("Enter your Choice");
				System.out.println("1. Add Employee");
				System.out.println("2. View Employee");
				System.out.println("3. Add Emp to Array");
				System.out.println("4. Sort the employee by empno");
				System.out.println("5.Sort the Employee by name");
				System.out.println("6.Serialization");
				System.out.println("7.DeSerialization");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					ec.addEmp();
					break;
				}
				case 2: {
					ec.viewEmp();
					break;
				}
				case 3: {
					ec.addEmpToArray();
					break;
				}
				case 4:{
					ec.sortByEmpno();
					break;
				}
				case 5:{
					ec.sortByEname();
					break;
				}
				case 6:{
					ec.serializeEmp();
					break;
				}
				case 7:{
					ec.deserializeEmp();
					break;
				}
				default: {
					System.out.println("Enter the right choice ...");
				}
				}
				System.out.println("Do u wanna continue? Y |y");
				ch = sc.next();
			} while (ch.equals("Y") || ch.equals("y"));

		}

		else {
			throw new UserNotFoundException("OOPS... NO USER :(");
		}
	
	}
	catch(UserNotFoundException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("UNF finally...");
	}

	
}
}