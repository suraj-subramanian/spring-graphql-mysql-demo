package com.surajsbmn.graphql.bookstore;

import graphql.schema.DataFetcher;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.surajsbmn.graphql.bookstore.model.Author;
import com.surajsbmn.graphql.bookstore.model.Book;
import com.surajsbmn.graphql.bookstore.repository.AuthorRepository;
import com.surajsbmn.graphql.bookstore.repository.BooksRepository;

@Component
public class GraphQLDataFetchers {

	@Autowired
	private BooksRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
    public DataFetcher<Book> getBookByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String bookId = dataFetchingEnvironment.getArgument("id");
           Optional<Book> book =  bookRepository.findById(bookId);
           return book.isPresent()?book.get():null;
        };
    }
    
    public DataFetcher<List<Author>> getAuthors(){
    	return dataFetchingEnvironment -> {
    		return (List<Author>)authorRepository.findAll();	
    	};
    }
    
    public DataFetcher<List<Book>> getBooks() {
    	return dataFetchingEnvironment -> {
    		return (List<Book>) bookRepository.findAll();
    	};
    }

    public DataFetcher<Author> getAuthorDataFetcher() {
        return dataFetchingEnvironment -> {
            Book book = dataFetchingEnvironment.getSource();
            Author a = book.getAuthor();
            return a==null?null:a;
        };
    }
    
    public DataFetcher<Author> getAuthorById(){
    	 return dataFetchingEnvironment -> {
    		 String authorId = dataFetchingEnvironment.getArgument("id");
    		 Optional<Author> author = authorRepository.findById(authorId);
    		 return author.isPresent()?author.get():null;
    	 };
    }
}
