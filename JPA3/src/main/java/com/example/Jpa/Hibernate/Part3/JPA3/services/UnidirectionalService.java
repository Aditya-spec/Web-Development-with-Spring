package com.example.Jpa.Hibernate.Part3.JPA3.services;

import com.example.Jpa.Hibernate.Part3.JPA3.entities.AuthorUnidirection;
import com.example.Jpa.Hibernate.Part3.JPA3.entities.BookUnidirection;
import com.example.Jpa.Hibernate.Part3.JPA3.repositories.UnidirectionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UnidirectionalService {
    @Autowired
    private UnidirectionalRepository unidirectionalRepository;
    public void setData(){
        AuthorUnidirection authorUnidirection =new AuthorUnidirection();
         Set<BookUnidirection> bookUnidirectionSet =new HashSet<BookUnidirection>();
        BookUnidirection bookUnidirection1 =new BookUnidirection();
        BookUnidirection bookUnidirection2 =new BookUnidirection();
        authorUnidirection.setName("Echo");
        bookUnidirection1.setBookName("book1");
        bookUnidirection2.setBookName("book2");
        bookUnidirectionSet.add(bookUnidirection1);
        bookUnidirectionSet.add(bookUnidirection2);
        authorUnidirection.setBookUnidirectional(bookUnidirectionSet);
        unidirectionalRepository.save(authorUnidirection);
    }
}
