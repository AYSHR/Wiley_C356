package com.wiley.sbconcept.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
@Table(name = "Course_TBL")
public class Course {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String abbr;
	private int modules;
	private double fee;
    
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "STUDENT_COURSE_TBL", joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
	private Set<Student> enrolledStudent = new HashSet<>();

	
	
	
	// getters and setters
	public Set<Student> getEnrolledStudent() {
		return enrolledStudent;
	}

	public void setEnrolledStudent(Set<Student> enrolledStudent) {
		this.enrolledStudent = enrolledStudent;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	/*
	 * @ManyToMany(mappedBy="courses", fetch=FetchType.LAZY)
	 * 
	 * @JsonBackReference private Set<Student> students;
	 * 
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public int getModules() {
		return modules;
	}

	public void setModules(int modules) {
		this.modules = modules;
	}

}
