package com.example.Hibernate3.repos;


import com.example.Hibernate3.entities.AuthorWithoutExtraTable;
import org.springframework.data.repository.CrudRepository;

public interface WithoutExtraTableRepository extends CrudRepository<AuthorWithoutExtraTable, Integer> {
}
