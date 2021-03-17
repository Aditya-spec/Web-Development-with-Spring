package com.example.Jpa.Hibernate.Part3.JPA3.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AuthorUnidirection {
    @Id
    @GeneratedValue
    int id;
    String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Set<BookUnidirection> bookUnidirection;

    public Set<BookUnidirection> getBookUnidirectional() {
        return bookUnidirection;
    }

    public void setBookUnidirectional(Set<BookUnidirection> bookUnidirection) {
        this.bookUnidirection = bookUnidirection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
