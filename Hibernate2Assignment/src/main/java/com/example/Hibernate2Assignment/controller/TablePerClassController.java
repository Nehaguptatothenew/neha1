package com.example.Hibernate2Assignment.controller;

//import com.example.Hibernate2Assignment.model.CheckNumberSingleTable;
import com.example.Hibernate2Assignment.model.CheckNumberTablePerClass;
//import com.example.Hibernate2Assignment.model.CreditCardSingleTable;
import com.example.Hibernate2Assignment.model.CreditCardTablePerClass;
//import com.example.Hibernate2Assignment.repository.SingleInheritanceRepository;
import com.example.Hibernate2Assignment.repository.TablePerClassInheritanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TablePerClassController
{
    @Autowired
    TablePerClassInheritanceRepository repository;
    @GetMapping("/tablePerClassInheritance")
    void setData()
    {
        /*CheckNumberSingleTable checkNumberSingleTable=new CheckNumberSingleTable();
        checkNumberSingleTable.setId(120);
        checkNumberSingleTable.setAmount(20000);
        checkNumberSingleTable.setCheckNumber("16647768679");

        CreditCardSingleTable creditCardSingleTable=new CreditCardSingleTable();
        creditCardSingleTable.setId(121);
        creditCardSingleTable.setAmount(20000);
        creditCardSingleTable.setCardNumber("dfkdjf");
        repository.save(checkNumberSingleTable);
        repository.save(creditCardSingleTable);
        */
        CheckNumberTablePerClass checkNumberTablePerClass=new CheckNumberTablePerClass();
        checkNumberTablePerClass.setId(120);
        checkNumberTablePerClass.setAmount(20000);
        checkNumberTablePerClass.setCheckNumber("12324456");

        CreditCardTablePerClass creditCardTablePerClass=new CreditCardTablePerClass();
        creditCardTablePerClass.setId(121);
        creditCardTablePerClass.setAmount(43555);
        creditCardTablePerClass.setCardNumber("37379823");
        repository.save(checkNumberTablePerClass);
        repository.save(creditCardTablePerClass);

    }
}
