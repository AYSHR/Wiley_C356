package com.wiley.springcore.ci;

public class Person {
	 private String name;
      private int id;
      private cert cobj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public cert getCobj() {
		return cobj;
	}
	public void setCobj(cert cobj) {
		this.cobj = cobj;
	}
	public Person(String name, int id, cert cobj) {
		super();
		this.name = name;
		this.id = id;
		this.cobj = cobj;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", cobj=" + cobj.getCertname() + "]";
	}
	public Person() {
		super();
	
	}
      
	
    
}