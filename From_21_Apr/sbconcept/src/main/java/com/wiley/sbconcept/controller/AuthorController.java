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
import com.wiley.sbconcept.model.Author;
import com.wiley.sbconcept.model.Department;
import com.wiley.sbconcept.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
    private AuthorService authService;
	
	@GetMapping("/authors")
    public List<Author> getAllAuthor(){

        return authService.getAuthorList();
    }
    @PostMapping("/authors")
    public Author createDepartment(@RequestBody Author author){
        return authService.createAuthor(author);
    }
    
    @GetMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable("id") Long authorId) throws DepNotFoundException {
           
        return authService.getAuthorById(authorId);
    }
    
    @DeleteMapping("/authors/{id}")
    public String deleteAuthorById(@PathVariable("id") Long authorId) throws DepNotFoundException {
    	
    	authService.deleteAuthorById(authorId); 
        return "author data  deleted successfully";
    }
    
    @PutMapping("/authors/{id}")
    public String updateAuthorById(@PathVariable("id") Long authorId,@RequestBody Author author) {
    	
    	authService.updateAuthor(authorId,author); 
        return "author data updated successfully";
    }
    
}
