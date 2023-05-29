package com.wiley.springcore.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refmain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/reftype/configref.xml");
		classA a =(classA) context.getBean("refa");
		System.out.println(a.getObj1().getCount());
	}
	
       
	
	
}
