package com.wiley.springcore.misc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/misc/config.xml");
		Employee emp1=context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		
		emp1.displaydetails();
		
		SingleTonA obj=SingleTonA.getSingleTonA();
		obj.sayHello();
	}

}

