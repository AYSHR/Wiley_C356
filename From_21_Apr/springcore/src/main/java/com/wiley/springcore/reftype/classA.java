package com.wiley.springcore.reftype;

public class classA {
 private int counta;
 private classB obj;

public classB getObj1() {
	return obj;
}

public void setObj(classB obj) {
	this.obj = obj;
}

public int getCounta() {
	return counta;
}

public void setCounta(int counta) {
	this.counta = counta;
}

public classA(int counta) {
	super();
	this.counta = counta;
}

public classA() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "classA [counta=" + counta + "]";
}

public classB getObj() {
	// TODO Auto-generated method stub
	return null;
}
 
}
