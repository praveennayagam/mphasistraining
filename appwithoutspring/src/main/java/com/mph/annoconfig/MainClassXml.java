package com.mph.annoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassXml {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("annogreet.xml");
		GreetingService gserv=(GreetingService)context.getBean("greetingServiceImp1");
		gserv.sayHi();
	}

}
