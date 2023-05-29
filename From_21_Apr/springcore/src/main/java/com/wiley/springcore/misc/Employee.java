package com.wiley.springcore.misc;

import javax.annotation.Resource;

public class Employee {
  private String name;
  
  @Resource
  private Address address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
}
public Employee(String name) {
	super();
	this.name = name;
}


public void displaydetails() {
	System.out.println("Employee [name=" + name + ", address=" + address + "]");
}
  
  
}
