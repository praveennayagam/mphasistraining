package com.mph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fourth {
	public void divide() throws IOException {
		try {
			int x = 10, z = 0;
			int y = 0;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("enter x");
			x = Integer.parseInt(br.readLine());
			System.out.println("enter y");
			y = Integer.parseInt(br.readLine());

			z = x / y;
			System.out.println("z :" + z);

		} catch (ArithmeticException e) {

			System.out.println("dont divide by zero");
		}
//		catch (NumberFormatException e) {
//			System.out.println("dont divide by character");
//		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

class Fifth extends Fourth {
	public void divide() throws IOException{
		try {
			int x = 10, z = 0;
			int y = 0;
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("enter x");
			x = Integer.parseInt(br.readLine());
			System.out.println("enter y");
			y = Integer.parseInt(br.readLine());

			z = x / y;
			System.out.println("z :" + z);

		} catch (ArithmeticException e) {

			System.out.println("dont divide by zero");
		}
//		catch (NumberFormatException e) {
//			System.out.println("dont divide by character");
//		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Fourth f4=new Fourth();
		Fifth f5 = new Fifth();
		f5.divide();
		f4.divide();
		System.out.println("main ends");

	}

}
