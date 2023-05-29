package com.wiley.springcore.reftype;

public class classB {
 private int count;
 


public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public classB(int count) {
	super();
	this.count = count;
}

@Override
public String toString() {
	return "classB [count=" + count + "]";
}

public classB() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
