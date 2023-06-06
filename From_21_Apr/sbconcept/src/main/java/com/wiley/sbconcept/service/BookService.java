package com.wiley.sbconcept.service;

import java.util.List;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Books;


public interface BookService {
       

    public Books createBook(Books book);
    public List<Books> getBookList();
    public Books getBookById(Long isbn) throws DepNotFoundException;
    public Books getBookByName(String bookname);
    public void deleteBookById(Long isbn)throws DepNotFoundException;
	public Books updateBook(Long isbn, Books book);
}
