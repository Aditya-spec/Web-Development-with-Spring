package com.example.Jpa.Hibernate.Part3.JPA3.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String authorName;

    @Embedded
    private AuthorAddress address;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Subject> subjects=new HashSet<>();

    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
    private Book book;

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

    public AuthorAddress getAddress() {
        return address;
    }

    public void setAddress(AuthorAddress address) {
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    public void addSubject(Subject subject) {
        if (subject != null) {
            if (subjects == null) {
                subjects = new HashSet<Subject>();
            }
            subject.setAuthor(this);
            subjects.add(subject);
        }
    }
}
