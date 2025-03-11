package com.mph.controller;

import java.util.Comparator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.mph.dao.EmployeeDao;
import com.mph.model.Employee;
import com.mph.model.FulltimeSal;
import com.mph.model.PartimeSal;
import com.mph.model.Salary;

public class EmployeeController {
	Employee emp;
	Salary sal;
	PartimeSal psal;
	FulltimeSal fsal;
	Scanner sc = new Scanner(System.in);
	List emplist = new ArrayList();
	EmployeeDao dao=new EmployeeDao();

	public void addEmp() {

		emp = new Employee();
		sal = new Salary();
		psal = new PartimeSal();
		fsal = new FulltimeSal();
		System.out.println("Enter Empno");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter Ename");
		String ename = sc.next();
		emp.setEname(ename);

		System.out.println("1.Full time \n 2.Part time ");
		int type = sc.nextInt();
		if (type == 1) {
			System.out.println("Enter Basic");
			int basic = sc.nextInt();
			fsal.setBasic(basic);
			fsal.setHra();
			fsal.setPf();
			fsal.setGross();
			fsal.setNet();
			emp.setSal(fsal);
			emp. setFs(fsal);
			emp.setEtype("FullTime");
			dao.createEmp(emp, type);
			

		} else if (type == 2) {
			System.out.println("Enter Wages");
			int wages = sc.nextInt();
			System.out.println("Enter days");
			int days = sc.nextInt();
			psal.setWages(wages);
			psal.setDays(days);
			psal.setDayWages();
			emp.setSal(psal);
			emp.setPs(psal);
			emp.setEtype("Parttime");
			dao.createEmp(emp, type);
			
		} else {
			System.out.println("Enter right choice");
		}
		emplist.add(emp);
		System.out.println("Employee Added...");
	}

	public void sortByEmpno() {
		Collections.sort(emplist);
		Iterator i = emplist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

	public void viewEmp() {

		// System.out.println(emp.getEmpno() + " -- " + emp.getEname());
		// System.out.println(emp);
//		Iterator iss = emplist.iterator();
//		while (iss.hasNext()) {
//			System.out.println(iss.next());
//		}
		//emplist.forEach(emp -> System.out.println(emp));
		emplist.forEach( System.out::println);
		dao.showEmp();
	}

	public void addEmpToArray() {
		// TODO Auto-generated method stub
		System.out.println("How many emp to add?");
		int count = sc.nextInt();
		Employee[] eArr = new Employee[count];
		for (int i = 0; i < count; i++) {
			emp = new Employee();
			System.out.println("Enter Empno");
			int eno = sc.nextInt();
			emp.setEmpno(eno);

			System.out.println("Enter Ename");
			String ename = sc.next();
			emp.setEname(ename);
			System.out.println(emp);
			eArr[i] = emp;
		}
		for (Employee em : eArr) {
			System.out.println("Arr " + em);
		}
	}

	public void sortByEname() {
		Collections.sort(emplist, Employee.nameComparator);
		Iterator cc = emplist.iterator();
		while (cc.hasNext()) {
			System.out.println(cc.next());
		}
	}

	public void serializeEmp() {
		// TODO Auto-generated method stub
		try (FileOutputStream fos=new FileOutputStream("myfile.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){
			

			oos.writeObject(emplist);
			System.out.println("Serializable...");
		
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public void deserializeEmp() {

		try(FileInputStream fis=new FileInputStream("myfile.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);) {
		
			List emp=(List)ois.readObject();
			System.out.println(emp);
			fis.close();
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}

