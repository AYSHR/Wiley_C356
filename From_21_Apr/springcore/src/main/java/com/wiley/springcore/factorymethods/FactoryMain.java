package com.wiley.springcore.factorymethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/factorymethods/config.xml");
		Bar bar=context.getBean("bar",Bar.class);
		System.out.println("1. from factory instance method with arg passed as name :"+bar);
		System.out.println();
		
		Foo foo=context.getBean("foo",Foo.class);
        System.out.println("2. from factory instance method without arg : \n " +foo);
        System.out.println();
	
		SingletonFooFactory foo1=context.getBean("foo1",SingletonFooFactory.class);
	     System.out.println("3. from factory static method without arg : \n " +foo1);
	     
	 	
	 	
	 	System.out.println("4. from factory static method with arg : "); 
	 	SingletonBarFactory barfoo=context.getBean("barfoo",SingletonBarFactory.class);
	 	barfoo.display();
	}
	
	
}
