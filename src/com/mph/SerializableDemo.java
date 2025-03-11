package com.mph;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public void serializeEmp() {
		
		try {
			FileOutputStream fos=new FileOutputStream("myfile.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Employee emp=new Employee(11,"praveen");
			oos.writeObject(emp);
			System.out.println("Serializable...");
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	public void deSerializableEmp() {
		try {
			FileInputStream fis=new FileInputStream("myfile.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Employee emp=(Employee)ois.readObject();
			System.out.println(emp.getEmpno()+"--"+emp.getEname());
		} catch (FileNotFoundException e) {
	
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializableDemo  sd=new SerializableDemo();
		sd.serializeEmp();
		sd.deSerializableEmp();
	

	}

}
