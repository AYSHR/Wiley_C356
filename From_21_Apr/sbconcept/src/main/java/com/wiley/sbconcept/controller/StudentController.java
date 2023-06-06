package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.model.Course;
import com.wiley.sbconcept.model.Student;
import com.wiley.sbconcept.repository.CourseRepository;
import com.wiley.sbconcept.repository.StudentRepository;
import com.wiley.sbconcept.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private CourseRepository courseRepo;
	
	private StudentService service;

	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}

	@GetMapping
	public List<Student> findallStudent() {
		return studentRepo.findAll();
	}

	@GetMapping("/{studentId}")
	public Student findallStudentById(@PathVariable Long id) {
		return studentRepo.findById(id).orElse(null);
	}

	@GetMapping("/{studentName}")
	public List<Student> findallStudentByNmae(@PathVariable String name) {
		return studentRepo.findByName(name);
	}

	public StudentController(StudentRepository studentRepo, CourseRepository courseRepo) {
		super();
		this.studentRepo = studentRepo;
		this.courseRepo = courseRepo;
	}

	@GetMapping("/Search/{price}")
	public List<Course> findCourseLessThanFee(@PathVariable double price) {
	    return courseRepo.findByFeeLessThan(price);
	}
	
	@PutMapping("/{studentid}/course/{courseid}")
	public Student assignedCoursetoStudent(
		@PathVariable	Long studentid,
		@PathVariable   Long courseid) {
		return service.assignedCoursetoStudent(studentid,courseid);
	}

}
