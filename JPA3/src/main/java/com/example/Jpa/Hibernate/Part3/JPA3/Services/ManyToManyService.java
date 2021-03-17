package com.example.Jpa.Hibernate.Part3.JPA3.Services;

import com.example.Jpa.Hibernate.Part3.JPA3.Entities.AuthorManyToMany;
import com.example.Jpa.Hibernate.Part3.JPA3.Entities.BookManyToMany;
import com.example.Jpa.Hibernate.Part3.JPA3.Repositories.ManyToManyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ManyToManyService {
    @Autowired
    private ManyToManyRepository repository;

    public void createManyToMany() {
        AuthorManyToMany author1=new AuthorManyToMany();

        BookManyToMany book1=new BookManyToMany();
        BookManyToMany book2=new BookManyToMany();

        author1.setName("author1");
        book1.setName("book1");
        book2.setName("book2");
        author1.setBook(book1);
        author1.setBook(book2);
        repository.save(author1);
    }
}
