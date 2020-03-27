package com.example.Hibernate3.controller;

import com.example.Hibernate3.daos.UnidirectionalDao;
import com.example.Hibernate3.entities.AuthorUnidirectional;
import com.example.Hibernate3.repos.UnidirectionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnidirectionalController  {
    @Autowired
    UnidirectionalDao unidirectionalDao;
    @Autowired
    UnidirectionalRepository unidirectionalRepository;

    @GetMapping("/unidata")
    String setData(){
        AuthorUnidirectional authorUnidirectional=unidirectionalDao.setData();
        unidirectionalRepository.save(authorUnidirectional);
        return "unidirectional data set";
    }
}
