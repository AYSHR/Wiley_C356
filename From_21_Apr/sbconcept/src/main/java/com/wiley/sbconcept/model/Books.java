package com.wiley.sbconcept.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "isbn")
	private Long isbn = 0L;
	private String bookName;

	/*
	 * @OneToOne(mappedBy="book") private Author author;
	 */

	// getter and setter

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

}
