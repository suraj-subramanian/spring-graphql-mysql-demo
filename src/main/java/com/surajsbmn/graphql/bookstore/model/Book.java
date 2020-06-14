package com.surajsbmn.graphql.bookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@Column(name = "ID",length = 64)
	private String id;
	
	@Column(name = "NAME",nullable = false)
	private String name;
	
	@Column(name = "PAGE_COUNT")
	private Integer pageCount;
	
	@ManyToOne
	private Author author;

	public Book(String id, String name, Integer pageCount, Author author) {
		super();
		this.id = id;
		this.name = name;
		this.pageCount = pageCount;
		this.author = author;
	}

	public Book() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pageCount=" + pageCount + ", author=" + author + "]";
	}
	
}
