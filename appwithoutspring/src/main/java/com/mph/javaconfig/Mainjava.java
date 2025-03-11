package com.mph.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Mainjava {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		GreetingService gserv1=(GreetingService)context.getBean("gs1");
		gserv1.sayHi();
		System.out.println(gserv1.hashCode());
		GreetingService gserv2=(GreetingService)context.getBean("gs1");
		gserv2.sayHi();
		System.out.println(gserv2.hashCode());
	}

}
