package com.example.gql.GraphqlDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String id;
    private String name;
    private int pageCount;
    private String authorId;
}