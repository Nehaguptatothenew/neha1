package com.example.Hibernate2Assignment.repository;

import com.example.Hibernate2Assignment.controller.TablePerClassController;
import com.example.Hibernate2Assignment.model.PaymentTablePerClass;
import org.springframework.data.repository.CrudRepository;

public interface TablePerClassInheritanceRepository extends CrudRepository<PaymentTablePerClass,Integer> {
}
