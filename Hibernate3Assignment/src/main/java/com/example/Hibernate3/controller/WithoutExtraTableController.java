package com.example.Hibernate3.controller;

import com.example.Hibernate3.daos.WithOutExtraTableDao;
import com.example.Hibernate3.entities.AuthorWithoutExtraTable;
import com.example.Hibernate3.repos.WithoutExtraTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithoutExtraTableController {
    @Autowired
    WithOutExtraTableDao withOutExtraTableDao;
    @Autowired
    WithoutExtraTableRepository withoutExtraTableRepository;

    @GetMapping("/notabledata")
    String setData(){
        AuthorWithoutExtraTable authorWithoutExtraTable=withOutExtraTableDao.setData();
        withoutExtraTableRepository.save(authorWithoutExtraTable);
        return "data set without creating extra data";
    }

}
