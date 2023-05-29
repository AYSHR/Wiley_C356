package com.wiley.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {

	private int price;
     
	@PostConstruct
	public void start() {
		System.out.println("inside initiated");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("inside destroyed");
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pizza(int price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
