package com.example.Hibernate3.daos;

import com.example.Hibernate3.entities.Author;
import com.example.Hibernate3.entities.AuthorAddress;
import com.example.Hibernate3.entities.Book;
import com.example.Hibernate3.entities.Subject;
import org.springframework.stereotype.Component;

@Component
public class AuthorDao
{
    public Author authorData()
    {
        AuthorAddress authorAddress=new AuthorAddress();
        authorAddress.setStreetNumber("21/508");
        authorAddress.setLocation("Baraut");
        authorAddress.setState("UttarPradesh");
        Author author=new Author();
        author.setAuthorName("Neha Gupta");
        author.setAuthorAddress(authorAddress);
        Subject subject1=new Subject();
        subject1.setSubject("Maths");
        Subject subject2=new Subject();
        subject2.setSubject("English");
        Subject subject3=new Subject();
        subject3.setSubject("hindi");
        subject1.setAuthor(author);
        subject2.setAuthor(author);
        subject3.setAuthor(author);
        author.addSubject(subject1);
        author.addSubject(subject2);
        author.addSubject(subject3);
        Book book=new Book();
        book.setBookName("MyWriting");
        book.setAuthor(author);
        return author;
    }
}
