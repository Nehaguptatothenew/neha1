package com.example.Hibernate2Assignment.controller;

import com.example.Hibernate2Assignment.model.EmployeeEmbedded;
import com.example.Hibernate2Assignment.model.Salary;
import com.example.Hibernate2Assignment.repository.EmbeddedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmbeddedController {
    @Autowired
    EmbeddedRepository repository;


    @GetMapping("/embeddedMaping")
    void embedd(){
        Salary salary=new Salary();
        salary.setBasicSalary(15000);
        salary.setBonusSalary(2000);
        salary.setSpecialAllowanceSalary(1890);
        salary.setTaxAmount(2000);
        EmployeeEmbedded employeeEmbedded=new EmployeeEmbedded();
        employeeEmbedded.setFirstName("Neha");
        employeeEmbedded.setLastName("Gupta");
        employeeEmbedded.setAge(23);
        employeeEmbedded.setSalary(salary);
        repository.save(employeeEmbedded);

    }

}
