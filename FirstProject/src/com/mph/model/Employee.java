
package com.mph.model;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Comparable <Employee>,Serializable{
	
	private int empno;
	private String ename;
	private Salary sal;
	private FulltimeSal fs;
	private PartimeSal ps;
	private String etype;

	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
	}

	public FulltimeSal getFs() {
		return fs;
	}

	public void setFs(FulltimeSal fs) {
		this.fs = fs;
	}

	public PartimeSal getPs() {
		return ps;
	}

	public void setPs(PartimeSal ps) {
		this.ps = ps;
	}

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

	public Salary getSal() {
		return sal;
	}

	public void setSal(Salary sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		return this.empno -e1.empno;
	}
	
//	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
//		
//		@Override
//		public int compare(Employee e1, Employee e2) {
//			// TODO Auto-generated method stub
//			return e1.getEname().compareTo(e2.getEname());
//		}
//	};
	
	public static Comparator<Employee> nameComparator = Comparator.comparing(Employee::getEname);
}

