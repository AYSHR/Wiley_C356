package com.wiley.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.wiley.springcore.config")
public class SpringConfig {
	@Bean
	public Beer getBeer() {
		return new Beer();
	}

	@Bean(name = {"st1", "st2"})
	public Student getStudent() {
		return new Student(getBeer());
		
	}
}
