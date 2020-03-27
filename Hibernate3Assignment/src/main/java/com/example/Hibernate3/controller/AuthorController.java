package com.example.Hibernate3.controller;

import com.example.Hibernate3.daos.AuthorDao;
import com.example.Hibernate3.entities.Author;
import com.example.Hibernate3.repos.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AuthorController
{
    @Autowired
    AuthorRepository repository;
    @Autowired
    AuthorDao authorDao;
    @GetMapping("/saveAuthor")
    String saveAuthor()
    {
        Author author=authorDao.authorData();
        repository.save(author);
        return "Record added sucessfully";
    }
}
