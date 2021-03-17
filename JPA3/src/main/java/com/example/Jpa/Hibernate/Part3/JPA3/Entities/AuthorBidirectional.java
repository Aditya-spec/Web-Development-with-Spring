package com.example.Jpa.Hibernate.Part3.JPA3.Entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class AuthorBidirectional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<BookBidirectional> book;

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Set<BookBidirectional> getBook() {
        return book;
    }

    public void setBook(Set<BookBidirectional> book) {
        this.book = book;
    }

    public void setBook(BookBidirectional book) {
        if (book != null) {
            if (this.book == null) {
                this.book = new HashSet<>();
            }
            book.setAuthor(this);
            this.book.add(book);
        }
    }
}
