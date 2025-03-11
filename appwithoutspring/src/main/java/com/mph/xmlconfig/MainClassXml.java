package com.mph.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassXml {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("great.xml");
		GreetingService gserv=(GreetingService)context.getBean("gs");
		gserv.sayHi();
		System.out.println(gserv.hashCode());
		GreetingService gserv1=(GreetingService)context.getBean("gs");
		gserv1.sayHi();
		System.out.println(gserv.hashCode());
	}

}
