package com.example.gql.GraphqlDemo.controller;

import com.example.gql.GraphqlDemo.domain.Author;
import com.example.gql.GraphqlDemo.domain.Book;
import com.example.gql.GraphqlDemo.domain.CreateAuthorInput;
import com.example.gql.GraphqlDemo.repository.AuthorRepository;
import com.example.gql.GraphqlDemo.repository.BookRepository;;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;


@Slf4j
@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookRepository.findBookById(id);
    }

    @QueryMapping
    public Author authorById(@Argument String id) {
        return authorRepository.findAuthorById(id);
    }

    @MutationMapping
    public Author insertAuthor(@Argument CreateAuthorInput createAuthorInput) {
        log.info("BookController: {}", createAuthorInput);

        Author author = new Author(createAuthorInput.getId(),
                createAuthorInput.getFirstName(),
                createAuthorInput.getLastName());

        authorRepository.insert(author);
        return author;
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorRepository.findAuthorById(book.getAuthorId());
    }

}
