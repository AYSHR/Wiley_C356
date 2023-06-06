package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Author;


public interface AuthorService {


    public Author createAuthor(Author author);
    public List<Author> getAuthorList();
    public Author getAuthorById(Long authorId) throws DepNotFoundException;
    public Author getAuthorByName(String authorname);
    public void deleteAuthorById(Long authorId)throws DepNotFoundException;
	public Author updateAuthor(Long authorId, Author author);
}
