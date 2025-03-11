package com.mph;
class Emp{
	int eno=101;
	String ename="praveen";
	Emp(){
		System.out.println("emp constructor....");
	}
	Emp(int eno){
		this.eno=eno;
		System.out.println("emp constructor....");
	}

	public String getEmpDetails() {
		return eno+" "+ ename;
	}
	public void showId() {
		// TODO Auto-generated method stub
		
	}
}
class Manager extends Emp{
	String dept="IT";
	public Manager() {
		super(500);
		System.out.println("manager const.....");
	}
	
	public String getEmpDetails() {
		return super.getEmpDetails()+" "+dept;
	}
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
	//	System.out.println(e.getEmpDetails());
		Manager m=new Manager();
		//System.out.println(m.getEmpDetails());
		
		Emp e1=new Manager();
		System.out.println(e1.getEmpDetails());
		e1.showId();
		
		if(m instanceof Emp) {
			System.out.println("Employee...");
		}
			else {
				System.out.println("Manager...");
			}
		}
	}


