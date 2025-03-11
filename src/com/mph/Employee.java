package com.mph;

import java.io.Serializable;
import java.util.Comparator;

public class Employee  implements Comparable<Employee> ,Serializable {

	private transient int empno;
	private String ename;



	public Employee(int empno, String ename) {
	this.empno=empno;
	this.ename=ename;
	}


	//	Employee(){
//		System.out.println("from non parameterized");
//	}
//	Employee (int empno,String ename){
//		this.ename=ename;
//		this.empno=empno;
//	}
	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	public String toString() {
		return empno+" "+ename;
	}


	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		return this.empno - e1.empno;
	}
	
	
	public static Comparator <Employee> nameComparator =new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			return e1.getEname().compareTo(e2.getEname());
		}
	};
	

	
}
