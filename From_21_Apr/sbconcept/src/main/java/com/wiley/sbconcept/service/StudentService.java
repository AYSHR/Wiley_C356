package com.wiley.sbconcept.service;

import com.wiley.sbconcept.model.Student;
import com.wiley.sbconcept.repository.CourseRepository;
import com.wiley.sbconcept.repository.StudentRepository;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.model.Course;

@Service
public class StudentService {
     
	@Autowired
	private StudentRepository sturepo;
	@Autowired
	private CourseRepository courserepo;
	public Student assignedCoursetoStudent(Long studentid, Long courseid) {
		Set<Course> courseset=null;
		Student student=sturepo.findById(studentid).get();
		Course course=courserepo.findById(courseid).get();
		courseset=student.getAssignedCourses();
		courseset.add(course);
		student.setAssignedCourses(courseset);
		return sturepo.save(student);
	
	}

}
