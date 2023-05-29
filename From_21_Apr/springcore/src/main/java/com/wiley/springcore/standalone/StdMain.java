package com.wiley.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class StdMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/standalone/stdconfig.xml");
		Employee emp1= context.getBean("emp1",Employee.class);
			System.out.println(emp1);
			//below line will print package
			System.out.println(emp1.getPhones().getClass().getName());
	     Person p=context.getBean("person1",Person.class);
	     System.out.println(p.getFriends());
	     System.out.println(p.getCourse());
	
	}

}
