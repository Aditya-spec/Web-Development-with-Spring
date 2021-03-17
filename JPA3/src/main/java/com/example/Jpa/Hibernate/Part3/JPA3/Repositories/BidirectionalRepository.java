package com.example.Jpa.Hibernate.Part3.JPA3.Repositories;

import com.example.Jpa.Hibernate.Part3.JPA3.Entities.AuthorBidirectional;
import org.springframework.data.repository.CrudRepository;

public interface BidirectionalRepository extends CrudRepository<AuthorBidirectional,Integer> {
}
