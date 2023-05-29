package com.wiley.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfMain {
  public static void main(String[] args) {
	  ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		/*
		 * Student student=context.getBean("getStudent",Student.class);
		 * System.out.println(student); student.study();
		 */
	
		 Student st1 = context.getBean("st1", Student.class); 
		 //System.out.println(st1);
		 st1.study();
	
		
}
}
