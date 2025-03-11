package com.mph;

interface TwoWheeler{
	int noofwheels =4;
	public abstract  void move();
}
interface Animals{
	void eat();
}
//interface Animals extends TwoWheeler{
//}

class Bike implements TwoWheeler,Animals{

	@Override
	public void move() {
		System.out.println("Bike Moving...");
		
	}

	@Override
	public void eat() {
		System.out.println("eating....");
	
		
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TwoWheeler tw;
			Bike b=new Bike();
			b.move();
			b.eat();
	}

}
