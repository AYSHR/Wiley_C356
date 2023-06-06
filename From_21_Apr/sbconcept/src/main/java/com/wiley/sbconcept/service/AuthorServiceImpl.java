package com.wiley.sbconcept.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.sbconcept.exception.DepNotFoundException;
import com.wiley.sbconcept.model.Author;
import com.wiley.sbconcept.repository.AuthorRepo;


@Service
public class AuthorServiceImpl implements AuthorService{

	@Autowired
	private AuthorRepo authRepo;

	@Override
	public Author createAuthor(Author author) {
		// TODO Auto-generated method stub
		return authRepo.save(author);
	}

	@Override
	public List<Author> getAuthorList() {
		// TODO Auto-generated method stub
		return authRepo.findAll();
	}

	@Override
	public Author getAuthorById(Long authorId) throws DepNotFoundException {
		 Optional<Author> auth=authRepo.findById(authorId);
		 if(!auth.isPresent()) {
			 throw new DepNotFoundException("author data isn't available");
		 }
		return auth.get();
	}

	@Override
	public Author getAuthorByName(String authorname) {
		// TODO Auto-generated method stub
		return authRepo.findByAuthorName(authorname);
	}

	@Override
	public void deleteAuthorById(Long authorId) throws DepNotFoundException {
		// TODO Auto-generated method stub
		authRepo.deleteById(authorId);
	}

	@Override
	public Author updateAuthor(Long authorId, Author author) {
		Author authfromDB=authRepo.findById(authorId).get();
		if(Objects.nonNull(author.getAuthorCity()) && !"".equalsIgnoreCase(author.getAuthorCity())) {
			authfromDB.setAuthorCity(author.getAuthorCity());
		}
		if(Objects.nonNull(author.getAuthorCity()) && !"".equalsIgnoreCase(author.getAuthorCity())) {
			authfromDB.setAuthorCity(author.getAuthorCity());
		}
		 
		return authRepo.save(authfromDB);
		
	}
}
