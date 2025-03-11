package com.mph;


abstract class  Vehicle{
	int noofwheels =4;
	String fuel;
	Vehicle(){
		System.out.println("vehicle constr...");
	}
	public void start() {
		System.out.println("Starting..");
	}

	
	public abstract  void move();
}
 class  Bus extends Vehicle{

	@Override
	public void move() {
		System.out.println("Bus Moving...");
		
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
	Bus b =new Bus ();
		b.start();
		b.move();
	}

}
