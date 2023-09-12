package com.spring.services;

import com.spring.model.Author;
import com.spring.repository.AuthorRepository;
import com.spring.services.base.BaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServices implements BaseServices<Author,String> {

    @Autowired
    AuthorRepository authorRepository;


    @Override
    public long count() {
        return authorRepository.count();
    }

    @Override
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findById(String id) {
        return authorRepository.findById(id);
    }
    public List<Author>  findByEmail(String email){
        return authorRepository.getByEmail(email);
    }

    @Override
    public void save(Author author) {
        authorRepository.save(author);

    }

    @Override
    public void update(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void deleteById(String id) {
        authorRepository.deleteById(id);

    }
}

