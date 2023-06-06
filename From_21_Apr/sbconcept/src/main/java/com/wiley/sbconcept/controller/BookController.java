package com.wiley.sbconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Books;
import com.wiley.sbconcept.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Books> getAllBook() {

		return bookService.getBookList();
	}

	@PostMapping("/books")
	public Books createBook(@RequestBody Books book) {
		return bookService.createBook(book);
	}

	@GetMapping("/books/{id}")
	public Books getBookById(@PathVariable("id") Long isbn) throws DepNotFoundException {

		return bookService.getBookById(isbn);
	}

	@DeleteMapping("/books/{id}")
	public String deleteAuthorById(@PathVariable("id") Long isbn) throws DepNotFoundException {

		bookService.deleteBookById(isbn);
		return "book's data  deleted successfully";
	}

	@PutMapping("/books/{id}")
	public String updateBookById(@PathVariable("id") Long isbn, @RequestBody Books book) {

		bookService.updateBook(isbn, book);
		return "book's data updated successfully";
	}

}
