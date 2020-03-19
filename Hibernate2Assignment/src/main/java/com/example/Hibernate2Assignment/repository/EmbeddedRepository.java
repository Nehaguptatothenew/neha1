package com.example.Hibernate2Assignment.repository;

import com.example.Hibernate2Assignment.model.EmployeeEmbedded;
import org.springframework.data.repository.CrudRepository;

public interface EmbeddedRepository extends CrudRepository<EmployeeEmbedded,Integer> {
}
