package com.wiley.sbconcept.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wiley.sbconcept.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {
	public Author findByAuthorName(String authorName);
}
