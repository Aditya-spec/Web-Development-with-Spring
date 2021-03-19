package com.example.Jpa.Hibernate.Part3.JPA3.repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.entities.AuthorUnidirection;
import org.springframework.data.repository.CrudRepository;

public interface UnidirectionalRepository extends CrudRepository<AuthorUnidirection,Integer> {

}
