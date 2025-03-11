package com.mph;

class Task extends Thread{
	String taskName;
	public Task() {
		
	}
	
	public Task(String taskName,int priority) {
		this.taskName=taskName;
		setPriority(priority);
	}
	public void run() {
		System.out.println("Task "+taskName +" started with priority "+ getPriority());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Task Completed");
	}
}
public class TaskSchedularDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t1=new Task("task 1",Thread.MAX_PRIORITY);
		Task t2=new Task("task 2",Thread.MIN_PRIORITY);
		Task t3=new Task("task 3",Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}

}
