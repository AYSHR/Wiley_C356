package com.wiley.springcore.factorymethods;

public class SingletonBarFactory {
     
	private String name;
	private static final SingletonBarFactory INSTANCE = new SingletonBarFactory();
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    public static SingletonBarFactory createInstance(String name) {
        INSTANCE.setName(name);
        return INSTANCE;
    }
   
  
	
	public void display() {
		System.out.println("example of static factory method with args passed name : "+INSTANCE.getName());
	}
}
