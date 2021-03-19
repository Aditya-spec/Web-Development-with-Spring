package com.example.Jpa.Hibernate.Part3.JPA3.repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.entities.AuthorManyToMany;
import org.springframework.data.repository.CrudRepository;

public interface ManyToManyRepository extends CrudRepository<AuthorManyToMany,Integer> {
}
