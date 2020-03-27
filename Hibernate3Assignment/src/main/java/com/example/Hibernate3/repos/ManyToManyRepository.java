package com.example.Hibernate3.repos;

import com.example.Hibernate3.entities.AuthorManyToMany;
import org.springframework.data.repository.CrudRepository;

public interface ManyToManyRepository extends CrudRepository<AuthorManyToMany,Integer> {
}
