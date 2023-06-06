package com.wiley.sbconcept.model;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="author_id")
	private Long authorId;
	private String authorName;
	private String authorCity;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_author_id", referencedColumnName = "author_id")
	private List<Books> book;

	// getters and setters
	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorCity() {
		return authorCity;
	}

	public void setAuthorCity(String authorCity) {
		this.authorCity = authorCity;
	}

	public List<Books> getBook() {
		return book;
	}

	public void setBook(List<Books> book) {
		this.book = book;
	}

	/*
	 * @ManyToOne(fetch = FetchType.LAZY, optional = false)
	 * 
	 * @JoinColumn(name = "isbn", nullable = false)
	 * 
	 * @OnDelete(action = OnDeleteAction.CASCADE)
	 * 
	 * @JsonIgnore private Books book;
	 */

}
