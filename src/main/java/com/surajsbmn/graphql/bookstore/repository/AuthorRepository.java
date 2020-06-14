package com.surajsbmn.graphql.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.surajsbmn.graphql.bookstore.model.Author;

public interface AuthorRepository extends CrudRepository<Author, String> {

}
