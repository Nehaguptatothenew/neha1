package com.example.Hibernate3.repos;

import com.example.Hibernate3.entities.AuthorUnidirectional;
import org.springframework.data.repository.CrudRepository;

public interface UnidirectionalRepository extends CrudRepository<AuthorUnidirectional,Integer> {
}
