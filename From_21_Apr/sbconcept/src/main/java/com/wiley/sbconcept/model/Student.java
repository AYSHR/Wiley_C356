package com.wiley.sbconcept.model;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENT_TBL")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int age;
	private String dept;

	@ManyToMany
	@JoinTable(name = "STUDENT_COURSE_TBL", joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Course> assignedCourses = new HashSet<>();

	// getter setter
	public Set<Course> getAssignedCourses() {
		return assignedCourses;
	}

	public void setAssignedCourses(Set<Course> assignedCourses) {
		this.assignedCourses = assignedCourses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "STUDENT_COURSE_TBL", joinColumns = @JoinColumn(name =
	 * "student_id", referencedColumnName = "id"), inverseJoinColumns
	 * = @JoinColumn(name = "course_id", referencedColumnName = "id"))
	 * 
	 * // @OneToMany(mappedBy = "students")
	 * 
	 * @JsonManagedReference private Set<Course> courses;
	 */
}
