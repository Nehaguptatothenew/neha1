package com.example.Hibernate3.repos;


import com.example.Hibernate3.entities.AuthorBidirectional;
import org.springframework.data.repository.CrudRepository;

public interface BidirectionalRepository extends CrudRepository<AuthorBidirectional, Integer> {
}
