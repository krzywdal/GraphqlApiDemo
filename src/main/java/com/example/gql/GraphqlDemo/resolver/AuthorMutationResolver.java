package com.example.gql.GraphqlDemo.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.gql.GraphqlDemo.domain.Author;
import com.example.gql.GraphqlDemo.domain.CreateAuthorInput;
import com.example.gql.GraphqlDemo.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@NoArgsConstructor
@AllArgsConstructor
public class AuthorMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private AuthorRepository authorRepository;

    @Transactional
    public Author insertAuthor(CreateAuthorInput createAuthorInput) {
        log.info("Create Author for: {}", createAuthorInput);
        Author author = new Author(createAuthorInput.getId(),
                createAuthorInput.getFirstName(),
                createAuthorInput.getLastName());
        authorRepository.insert(author);
        return author;
    }
}
