package com.example.Jpa.Hibernate.Part3.JPA3.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class BookManyToMany {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(mappedBy = "books")
    private List<AuthorManyToMany> authors;

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

    public List<AuthorManyToMany> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorManyToMany> authors) {
        this.authors = authors;
    }
}
