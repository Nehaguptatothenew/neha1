package com.example.Hibernate3.daos;

import com.example.Hibernate3.entities.AuthorUnidirectional;
import com.example.Hibernate3.entities.BookUnidirectional;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class UnidirectionalDao {
    public AuthorUnidirectional setData(){
        AuthorUnidirectional authorUnidirectional=new AuthorUnidirectional();
        authorUnidirectional.setName("Neha");
        BookUnidirectional bookUnidirectional=new BookUnidirectional();
        BookUnidirectional bookUnidirectional1=new BookUnidirectional();
        bookUnidirectional.setBookName("book1");
        bookUnidirectional1.setBookName("book2");
        Set<BookUnidirectional> bookUnidirectionalSet=new HashSet<>();
        bookUnidirectionalSet.add(bookUnidirectional);
        bookUnidirectionalSet.add(bookUnidirectional1);
        authorUnidirectional.setBookUnidirectional(bookUnidirectionalSet);
        return authorUnidirectional;
    }
}
