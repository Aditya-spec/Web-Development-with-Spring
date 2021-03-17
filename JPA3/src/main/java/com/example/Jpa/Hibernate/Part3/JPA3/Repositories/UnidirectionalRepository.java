package com.example.Jpa.Hibernate.Part3.JPA3.Repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.Entities.AuthorUnidirection;
import org.springframework.data.repository.CrudRepository;

public interface UnidirectionalRepository extends CrudRepository<AuthorUnidirection,Integer> {
}
