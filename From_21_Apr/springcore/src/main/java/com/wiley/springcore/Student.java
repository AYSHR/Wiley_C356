package com.wiley.springcore;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Student {
	private int studentid;
	private String studentName;
	private String AddressName;
	private List<String> skills;
    private Set<String>  fruits;
    private HashMap<String,Integer> marks;
	public Student(int studentid, String studentName, String addressName, List<String> skills) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		AddressName = addressName;
		this.skills = skills;
	}

	public Student(int studentid, String studentName, String addressName, List<String> skills, Set<String> fruits,
			HashMap<String, Integer> marks) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		AddressName = addressName;
		this.skills = skills;
		this.fruits = fruits;
		this.marks = marks;
	}

	public Set<String> getFruits() {
		return fruits;
	}

	public void setFruits(Set<String> fruits) {
		this.fruits = fruits;
	}

	public HashMap<String, Integer> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, Integer> marks) {
		this.marks = marks;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "Student \n[studentid=" + studentid + ",\nstudentName=" + studentName + ", \nAddressName=" + AddressName
				+ ",\nskills=" + skills + ", \nfruits=" + fruits + ", \nmarks=" + marks + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentid, String studentName, String addressName) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		AddressName = addressName;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddressName() {
		return AddressName;
	}

	public void setAddressName(String addressName) {
		AddressName = addressName;
	}

	public static void main(String[] args) {

	}

}
