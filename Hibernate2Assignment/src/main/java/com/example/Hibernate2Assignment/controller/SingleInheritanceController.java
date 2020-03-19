package com.example.Hibernate2Assignment.controller;

import com.example.Hibernate2Assignment.model.CheckNumberSingleTable;
import com.example.Hibernate2Assignment.model.CreditCardSingleTable;
import com.example.Hibernate2Assignment.repository.SingleInheritanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleInheritanceController
{
    @Autowired
    SingleInheritanceRepository repository;
    @GetMapping("/singleInheritance")
    void setData()
    {
        CheckNumberSingleTable checkNumberSingleTable=new CheckNumberSingleTable();
        checkNumberSingleTable.setId(101);
        checkNumberSingleTable.setAmount(20000);
        checkNumberSingleTable.setCheckNumber("16647768679");

        CreditCardSingleTable creditCardSingleTable=new CreditCardSingleTable();
        creditCardSingleTable.setId(102);
        creditCardSingleTable.setAmount(20000);
        creditCardSingleTable.setCardNumber("dfkdjf");
        repository.save(checkNumberSingleTable);
        repository.save(creditCardSingleTable);


    }
}
