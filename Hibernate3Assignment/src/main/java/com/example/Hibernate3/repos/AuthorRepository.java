package com.example.Hibernate3.repos;

import com.example.Hibernate3.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer>
{

}
