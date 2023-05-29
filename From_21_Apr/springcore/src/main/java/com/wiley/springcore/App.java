package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) context.getBean("student1");
	/*	System.out.println(student.toString());
		
		Student std2 = (Student) context.getBean("student2");
	    System.out.println(std2);
	    
	    // using p-schema
	    Student std3 = (Student) context.getBean("student3");
	    System.out.println(std3); */
		
		Student std4= (Student) context.getBean("student4");
		System.out.println(std4);
		
		/*
		 * Student std5= (Student) context.getBean("student4");
		 * System.out.println(std5);
		 */
		Address add=(Address) context.getBean("ref1");
		System.out.println(add.getSobj().getStudentid());
	}
}

// order of writing dependencies so as to run program efficiently :- core-context- junit 
