package com.example.Hibernate2Assignment.repository;

import com.example.Hibernate2Assignment.model.PaymentJoinedTable;
import org.springframework.data.repository.CrudRepository;

public interface JoinedInheritanceRepository extends CrudRepository<PaymentJoinedTable,Integer> {
}
