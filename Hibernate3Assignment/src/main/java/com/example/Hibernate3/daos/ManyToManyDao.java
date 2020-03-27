package com.example.Hibernate3.daos;

import com.example.Hibernate3.entities.Author;
import com.example.Hibernate3.entities.AuthorManyToMany;
import com.example.Hibernate3.entities.BookManyToMany;
import com.example.Hibernate3.repos.ManyToManyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class ManyToManyDao
{
    @Autowired
    ManyToManyRepository repository;
    public void setData()
    {
        AuthorManyToMany authorManyToMany1 = new AuthorManyToMany();
        authorManyToMany1.setAuthorName("Chetan Bhagat");

        BookManyToMany bookManyToMany1 = new BookManyToMany();
        BookManyToMany bookManyToMany2 = new BookManyToMany();
        bookManyToMany1.setBookName("OneIndianGirl");
        bookManyToMany2.setBookName("Three Mistakes of My Life");
        Set<BookManyToMany> bookManyToManyHashSet = new HashSet<>();
        bookManyToManyHashSet.add(bookManyToMany1);
        bookManyToManyHashSet.add(bookManyToMany2);
        authorManyToMany1.setBookManyToManySet(bookManyToManyHashSet);


        AuthorManyToMany authorManyToMany2 = new AuthorManyToMany();
        authorManyToMany2.setAuthorName("Devdatt Pattanaik ");
        Set<AuthorManyToMany> authorManyToManyHashSet = new HashSet<>();
        authorManyToManyHashSet.add(authorManyToMany1);
        authorManyToManyHashSet.add(authorManyToMany2);
        bookManyToMany1.setAuthorManytoManySet(authorManyToManyHashSet);
        repository.save(authorManyToMany1);
        repository.save(authorManyToMany2);






    }


}
