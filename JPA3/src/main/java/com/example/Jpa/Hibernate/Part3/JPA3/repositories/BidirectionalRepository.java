package com.example.Jpa.Hibernate.Part3.JPA3.repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.entities.AuthorBidirectional;
import org.springframework.data.repository.CrudRepository;

public interface BidirectionalRepository extends CrudRepository<AuthorBidirectional,Integer> {
}
