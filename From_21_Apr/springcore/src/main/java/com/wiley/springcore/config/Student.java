package com.wiley.springcore.config;

import org.springframework.stereotype.Component;

//@Component("student")
public class Student {
	private Beer beer;
	
  public Beer getBeer() {
		return beer;
	}

	public void setBeer(Beer beer) {
		this.beer = beer;
	}

public Student(Beer beer) {
	super();
		this.beer = beer;
	}

public  void study() {
	  System.out.println("Student is studying");
  }
}
