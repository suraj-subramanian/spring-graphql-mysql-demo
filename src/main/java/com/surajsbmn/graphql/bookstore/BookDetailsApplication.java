package com.surajsbmn.graphql.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.surajsbmn.graphql.bookstore")
public class BookDetailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookDetailsApplication.class, args);
    }

}

