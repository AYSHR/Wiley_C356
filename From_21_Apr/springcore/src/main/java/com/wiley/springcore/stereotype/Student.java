package com.wiley.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sobj")
public class Student {
	@Value("harry")
	private String name;
	@Value("bangalore")
	private String city;

	@Value("#{mycourse}")
	private List<String> course;
	
	public List<String> getCourse() {
		return course;
	}

	public void setCourse(List<String> course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public Student(String name, String city, List<String> course) {
		super();
		this.name = name;
		this.city = city;
		this.course = course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", course=" + course + "]";
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
