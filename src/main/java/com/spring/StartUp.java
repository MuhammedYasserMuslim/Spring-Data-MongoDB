package com.spring;


import com.spring.model.Author;
import com.spring.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class StartUp implements CommandLineRunner {
    
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author("Muhammed","mohamedyasser2001898@gmail.com","01014129303");
        Author author2 = new Author("Mahmoud","Mahmoud8@gmail.com","01026717246");
        Author author3 = new Author("Ali","Ali@gmail.com","01550449403");
        Author author4 = new Author("Salah","Salah98@gmail.com","01228013580");
        authorRepository.insert(Arrays.asList(author,author2,author3,author4));

    }
}
