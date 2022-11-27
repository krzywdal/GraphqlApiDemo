# GraphqlApiDemo
GraphQL API Demo working with mongodb

## GraphQL properties

    spring.graphql.graphiql.enabled=true
    spring.graphql.graphiql.path=/graphiql

## GraphQL playground
    
    http://localhost:8080/graphiql?path=/graphql

## MongoDB properties

    spring.data.mongodb.uri=mongodb://localhost:27017/bookdb
    spring.data.mongodb.auto-index-creation=true

## To get book by id
    {
      bookById(id: "book-1") {
        name,
        pageCount
        author {
          id,
          firstName,
          lastName
        }
      }
    }

## To get author by id
    {
      authorById(id: "author-1") {
        id,
        firstName,
        lastName
      }
    }

## To add author
    mutation INSERT_NEW_AUTHOR {
        insertAuthor(createAuthorInput: {
            id: "author-1",
            firstName: "John",
            lastName: "Smith"})
        {
            id
            firstName
            lastName
        }
    }
