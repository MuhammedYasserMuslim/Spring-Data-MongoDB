package com.spring.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
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
@Document(collection = "authors")

public class Author {

    @Id
    private String id;


    @NotEmpty
    private String name;

    @Email
    private String email;

    private String phone;

    public Author(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}