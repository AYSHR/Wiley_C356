package com.wiley.springcore.standalone;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Employee {
	
	private List<String> phones;
    private Set<String>  address;
    private HashMap<String,Integer> courses;
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [phones=" + phones + ", address=" + address + ", courses=" + courses + "]";
	}
	public Employee(List<String> phones, Set<String> address, HashMap<String, Integer> courses) {
		super();
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public HashMap<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(HashMap<String, Integer> courses) {
		this.courses = courses;
	}
	

}
