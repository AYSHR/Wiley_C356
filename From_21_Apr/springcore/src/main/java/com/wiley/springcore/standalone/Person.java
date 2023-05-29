package com.wiley.springcore.standalone;

import java.util.List;
import java.util.Map;

public class Person {
private List<String> friends;
private Map<String,Integer> course;

public Map<String, Integer> getCourse() {
	return course;
}

public Person(List<String> friends, Map<String, Integer> course) {
	super();
	this.friends = friends;
	this.course = course;
}

public void setCourse(Map<String, Integer> course) {
	this.course = course;
}

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Person(List<String> friends) {
	super();
	this.friends = friends;
}

public Person() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", course=" + course + ", getCourse()=" + getCourse() + ", getFriends()="
			+ getFriends() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

}
