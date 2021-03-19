package com.example.Jpa.Hibernate.Part3.JPA3.services;

import com.example.Jpa.Hibernate.Part3.JPA3.entities.AuthorManyToMany;
import com.example.Jpa.Hibernate.Part3.JPA3.entities.BookManyToMany;
import com.example.Jpa.Hibernate.Part3.JPA3.repositories.ManyToManyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ManyToManyService {
    @Autowired
    private ManyToManyRepository repository;

    @Transactional
    public void createManyToMany() {
        AuthorManyToMany author1=new AuthorManyToMany();
        AuthorManyToMany author2=new AuthorManyToMany();

        BookManyToMany book1=new BookManyToMany();
        BookManyToMany book2=new BookManyToMany();
        BookManyToMany book3=new BookManyToMany();
        BookManyToMany book4=new BookManyToMany();

        author1.setName("author1");
        author2.setName("author2");
        book1.setName("book1");
        book2.setName("book2");
        book3.setName("book1");
        book4.setName("book4");

        author1.setBook(book1);
        author1.setBook(book2);
        author2.setBook(book2);
        author2.setBook(book3);
        author1.setBook(book4);

        repository.save(author1);
        repository.save(author2);
    }
}
