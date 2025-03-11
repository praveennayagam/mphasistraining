package com.mph.props;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassPrps {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("db.xml");
		DBconn db=(DBconn) context.getBean("db");
		System.out.println(db.getUrl());
		System.out.println(db.getUname());
		System.out.println(db.getPass());

	}

}
