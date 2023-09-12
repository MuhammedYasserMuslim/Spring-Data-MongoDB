package com.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "authors")

public class Author {

    @Id
    private String id;

    private String name;

    private String email;

    private String phone;

    public Author(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}