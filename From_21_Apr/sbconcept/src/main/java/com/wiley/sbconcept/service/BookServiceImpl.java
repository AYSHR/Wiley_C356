package com.wiley.sbconcept.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Books;
import com.wiley.sbconcept.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public Books createBook(Books book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public List<Books> getBookList() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public Books getBookById(Long isbn) throws DepNotFoundException {
		 Optional<Books> book=bookRepo.findById(isbn);
		 if(!book.isPresent()) {
			 throw new DepNotFoundException("bookdata isn't available");
		 }
		return book.get();
	}

	@Override
	public Books getBookByName(String bookname) {
		// TODO Auto-generated method stub
		return bookRepo.findByBookName(bookname);
	}

	@Override
	public void deleteBookById(Long isbn) throws DepNotFoundException {
		bookRepo.deleteById(isbn);
		
	}

	@Override
	public Books updateBook(Long isbn, Books book) {
		Books authfromDB=bookRepo.findById(isbn).get();
		if(Objects.nonNull(book.getBookName()) && !"".equalsIgnoreCase(book.getBookName())) {
			authfromDB.setBookName(book.getBookName());
		}
		return bookRepo.save(authfromDB);
	}

}
