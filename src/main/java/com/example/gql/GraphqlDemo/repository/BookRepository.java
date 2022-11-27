package com.example.gql.GraphqlDemo.repository;

import com.example.gql.GraphqlDemo.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    /**
     *
     * @param id
     * @return
     */
    Book findBookById(String id);
}
