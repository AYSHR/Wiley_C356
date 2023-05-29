package com.wiley.springcore.lifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class lcmain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/lcconfig.xml");
		
		Pizza pz1=(Pizza) context.getBean("pizza");
		System.out.println(pz1);
		
	context.registerShutdownHook();
	}

}
