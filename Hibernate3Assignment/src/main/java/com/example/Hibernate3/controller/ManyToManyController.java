package com.example.Hibernate3.controller;

import com.example.Hibernate3.daos.ManyToManyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.ManyToMany;

@RestController
public class ManyToManyController {
    @Autowired
    ManyToManyDao manyToManyDao;
    @GetMapping("/manyToManyRelationship")
    void setData()
    {
        manyToManyDao.setData();
    }
}
