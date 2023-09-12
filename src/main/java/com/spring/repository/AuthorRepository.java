package com.spring.repository;

import com.spring.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends MongoRepository<Author,String> {

    @Query("{email: '?0'}")
    List<Author> getByEmail(String email);
}
