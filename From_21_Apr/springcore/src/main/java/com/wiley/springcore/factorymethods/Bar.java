package com.wiley.springcore.factorymethods;

public class Bar {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bar(String name) {
		super();
		this.name = name;
	}

	public Bar() {
		super();
		System.out.println("inside static factory method with args");
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + "]";
	}

}
