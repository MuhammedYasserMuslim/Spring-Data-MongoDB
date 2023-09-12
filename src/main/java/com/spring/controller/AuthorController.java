package com.spring.controller;

import com.spring.model.Author;
import com.spring.services.AuthorServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorServices authorServices;

    @GetMapping("/authors")
    public List<Author> findAll() {
        return authorServices.findAll();
    }

    @GetMapping("/author")
    public Optional<Author> findById(@RequestParam String id) {
        return authorServices.findById(id);
    }

    @GetMapping("/aut")
    public List<Author>  findByEmail(@RequestParam String email){
        return authorServices.findByEmail(email);
    }

    @PostMapping("/authors")
    public Author insertAuthor(@RequestBody @Valid Author author) {
        authorServices.save(author);
        return author;
    }
    @PutMapping("/authors")
    public Author updateAuthor(@RequestBody @Valid  Author author) {
        authorServices.update(author);
        return author;
    }

    @DeleteMapping("/author")
    public Author deleteAuthorById(@RequestParam String id) {
        Author author ;
        author = authorServices.findById(id).get();
        authorServices.deleteById(id);
        return author;
    }
}
