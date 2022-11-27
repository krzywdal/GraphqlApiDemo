package com.example.gql.GraphqlDemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CreateAuthorInput {
    private String id;
    private String firstName;
    private String lastName;
}
