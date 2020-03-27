package com.example.Hibernate3.controller;


import com.example.Hibernate3.daos.BidirectionalDao;
import com.example.Hibernate3.entities.AuthorBidirectional;
import com.example.Hibernate3.repos.BidirectionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BidirectionalController {
    @Autowired
    BidirectionalDao bidirectionalDao;
    @Autowired
    BidirectionalRepository bidirectionalRepository;

    @GetMapping("/bidata")
    String setData(){
        AuthorBidirectional authorBidirectional=bidirectionalDao.setData();
        bidirectionalRepository.save(authorBidirectional);
        return "bidirectional data set";
    }

}
