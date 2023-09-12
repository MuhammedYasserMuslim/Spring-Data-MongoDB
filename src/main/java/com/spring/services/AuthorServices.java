package com.spring.services;

import com.spring.model.Author;
import com.spring.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServices {

    @Autowired
    AuthorRepository authorRepository;


    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Optional<Author> getById(String id) {
        return authorRepository.findById(id);
    }
}
