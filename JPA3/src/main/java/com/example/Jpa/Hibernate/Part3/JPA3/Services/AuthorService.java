package com.example.Jpa.Hibernate.Part3.JPA3.Services;

import com.example.Jpa.Hibernate.Part3.JPA3.Entities.*;
import com.example.Jpa.Hibernate.Part3.JPA3.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;



    public void createAuthorInstance(){
        Author author1=new Author();
        AuthorAddress authorAddress=new AuthorAddress();
        Subject subject1=new Subject();
        Subject subject2=new Subject();
        Subject subject3=new Subject();
        Book book=new Book();



        author1.setAuthorName("Alpha");
        authorAddress.setStreetNumber(22);
        authorAddress.setLocation("mumbai");
        authorAddress.setState("Maharashtra");
        author1.setAddress(authorAddress);

        subject1.setSubjectName("JVM");
        subject2.setSubjectName("SQL");
        subject3.setSubjectName("Spring");

        book.setBookName("Starting in Data Structures");
        book.setAuthor(author1);

        author1.addSubject(subject1);
        author1.addSubject(subject2);
        author1.addSubject(subject3);
        author1.setBook(book);

        authorRepository.save(author1);

    }


}
