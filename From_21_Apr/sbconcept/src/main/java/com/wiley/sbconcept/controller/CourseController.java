
package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.model.Course;
import com.wiley.sbconcept.repository.CourseRepository;

@RestController
@RequestMapping("/course")
public class CourseController {
	private final  CourseRepository courseRepo;
	
	public CourseController( CourseRepository courseRepo) {
		super();
	
		this.courseRepo = courseRepo;
	}

	@PostMapping
	public Course createCourse(@RequestBody Course course) {
		return courseRepo.save(course);
	}

	@GetMapping
	public List<Course> findallCourse() {
		return courseRepo.findAll();
	}

	@GetMapping("/{courseId}")
	public Course findallCourseById(@PathVariable Long courseId) {
		return courseRepo.findById(courseId).orElse(null);
	}
    
	@DeleteMapping("/{courseId}")
	public String deleteCourse(@PathVariable Long courseId) {
		courseRepo.deleteById(courseId);
		return "course deleted successfully";
	}
}