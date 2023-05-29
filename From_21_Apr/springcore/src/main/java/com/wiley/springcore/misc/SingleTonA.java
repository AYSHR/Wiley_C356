package com.wiley.springcore.misc;

public class SingleTonA {
	//bean factory methods
 private static final SingleTonA obj=new SingleTonA();
  
 public SingleTonA() {
	 System.out.println("SingleTonA obj is created");
	 
 }
 
 //factory method
 public static SingleTonA getSingleTonA() {
	 return obj;
 }
 
 public void sayHello() {
	 System.out.println("say hello to the employee");
 }
}
