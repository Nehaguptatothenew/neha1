package com.example.Hibernate3.controller;

import com.example.Hibernate3.entities.Caching;
import com.example.Hibernate3.repos.CachingRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@RestController
public class CachingController
{
    @Autowired
    CachingRepository cachingRepository;
    @Autowired
    EntityManager entityManager;
    @GetMapping("/session")
    public void setData()
    {
        Caching caching1=new Caching();
        caching1.setId(1);
        caching1.setName("Neha");
        Caching caching2=new Caching();
        caching2.setId(2);
        caching2.setName("Gupta");
        cachingRepository.save(caching1);
        cachingRepository.save(caching2);
        Session session= entityManager.unwrap(Session.class);

    }
    @GetMapping("/evict")
    void evicting(){
        Caching caching1 = null;
        Optional<Caching> caching = cachingRepository.findById(1);
        if (caching.isPresent())
            caching1 = caching.get();
        cachingRepository.findById(1);
        cachingRepository.findById(1);
        Session session = entityManager.unwrap(Session.class);
        session.evict(caching1);
        cachingRepository.findById(1);
    }
}
