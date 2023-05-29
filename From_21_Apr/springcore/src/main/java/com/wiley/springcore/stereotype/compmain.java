package com.wiley.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class compmain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/wiley/springcore/stereotype/stdconfig.xml");
		Student std = context.getBean("sobj", Student.class);
		System.out.println(std);

		// we can pass either student or obj name passed in component annotation
		// otherwise it'll throw an error

	}
}
