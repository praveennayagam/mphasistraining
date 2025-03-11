package com.mph.pract;

import java.util.Arrays;
import java.util.List;

import com.mph.Employee;

public class TaskDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// java 8-1
		  Runnable r=() ->{
				Task t=new Task();
				 t.show();
			};
			Thread th=new Thread(r);
			th.start();

		// java 8-2
			Thread t1=new Thread(()-> {
				Task t=new Task();
				t.show();
					
			});
			t1.start();
			
			// java 8-3
			new Thread(()-> {
				Task t=new Task();
				t.show();
			}).start();
			
			//java 8-4
			new Thread(()->{
				new Task().show();
			}).start();
			
			// java 8-5
			new Thread(new Task():: show).start();
			
			Employee e1=new Employee(1,"Praveen");
			Employee e2=new Employee(2,"Rithik");
			Employee e3=new Employee(3,"Saravana");
			
			List elist=Arrays.asList(e1,e2,e3);
			System.out.println(elist);
			elist.forEach(li -> System.out.println(li));
	}

}
