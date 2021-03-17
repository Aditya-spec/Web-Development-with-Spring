package com.example.Jpa.Hibernate.Part3.JPA3.Repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
