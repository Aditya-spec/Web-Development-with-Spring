package com.example.Jpa.Hibernate.Part3.JPA3.Repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.Entities.AuthorManyToMany;
import org.springframework.data.repository.CrudRepository;

public interface ManyToManyRepository extends CrudRepository<AuthorManyToMany,Integer> {
}
