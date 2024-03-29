package com.wiley.sbconcept.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wiley.sbconcept.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
   List<Course> findByFeeLessThan(double price);
}
