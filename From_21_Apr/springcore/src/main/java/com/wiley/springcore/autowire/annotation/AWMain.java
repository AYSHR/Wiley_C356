package com.wiley.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AWMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/autoconfig.xml");
		// Emp emp= (Emp) context.getBean("emp1");
		Emp emp = context.getBean("emp1", Emp.class);
		System.out.println(emp);

		// the one with constructor autowire only- the var with same(address) var name
		// will be printed not the address1
	}

}
