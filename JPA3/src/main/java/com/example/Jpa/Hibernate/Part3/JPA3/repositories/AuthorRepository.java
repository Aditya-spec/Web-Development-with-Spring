package com.example.Jpa.Hibernate.Part3.JPA3.repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
