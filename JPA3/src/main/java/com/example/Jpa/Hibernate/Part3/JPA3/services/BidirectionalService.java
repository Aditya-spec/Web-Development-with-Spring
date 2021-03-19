package com.example.Jpa.Hibernate.Part3.JPA3.services;

import com.example.Jpa.Hibernate.Part3.JPA3.entities.AuthorBidirectional;
import com.example.Jpa.Hibernate.Part3.JPA3.entities.BookBidirectional;
import com.example.Jpa.Hibernate.Part3.JPA3.repositories.BidirectionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidirectionalService {
    @Autowired
    private BidirectionalRepository bidirectionalRepository;

    public void createBidirectionalInstance() {
        AuthorBidirectional author = new AuthorBidirectional();
        BookBidirectional book1 = new BookBidirectional();
        BookBidirectional book2 = new BookBidirectional();
        author.setAuthorName("Raman");
        book1.setBookName("C++");
        book2.setBookName("Java Programming");
       /* book1.setAuthorBidirectional(author);
        book2.setAuthorBidirectional(author);*/
        author.setBook(book1);
        author.setBook(book2);
        bidirectionalRepository.save(author);
    }
}
