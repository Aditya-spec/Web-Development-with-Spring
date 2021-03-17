package com.example.Jpa.Hibernate.Part3.JPA3.Entities;

import javax.persistence.*;

@Entity
public class BookBidirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorBidirectional author;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AuthorBidirectional getAuthor() {
        return author;
    }

    public void setAuthor(AuthorBidirectional author) {
        this.author = author;
    }
}
