package com.mph;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThrowDemo {

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
		
		if(un.equals("Praveen") && pwd.equals("pass")) {
			System.out.println("welcome "+ un);
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
