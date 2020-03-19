package com.example.Hibernate2Assignment.repository;

import com.example.Hibernate2Assignment.model.PaymentSingleTable;
import org.springframework.data.repository.CrudRepository;

public interface SingleInheritanceRepository extends CrudRepository<PaymentSingleTable,Integer> {
}
