package com.wiley.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class cimain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/ci/ciconfig.xml");
        Person p = (Person) context.getBean("ref");
        System.out.println(p);
    }
}
