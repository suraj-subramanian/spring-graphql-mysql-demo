package com.surajsbmn.graphql.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.surajsbmn.graphql.bookstore.model.Book;

@Repository
public interface BooksRepository extends CrudRepository<Book, String> {

}
