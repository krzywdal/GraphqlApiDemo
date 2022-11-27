# graphqlApiDemo
GraphQL API Demo working with mongodb


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
