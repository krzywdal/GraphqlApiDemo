package com.example.gql.GraphqlDemo.repository;

import com.example.gql.GraphqlDemo.domain.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {

    /**
     *
     * @param id
     * @return
     */
    Author findAuthorById(String id);

}
