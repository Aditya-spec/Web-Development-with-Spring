
package com.example.Jpa.Hibernate.Part3.JPA3.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "author_m")
public class AuthorManyToMany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    private Set<BookManyToMany> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public Set<BookManyToMany> getBookManyToMany() {
        return books;
    }

    public void setBookManyToMany(Set<BookManyToMany> bookManyToMany) {
        this.books = bookManyToMany;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(BookManyToMany book) {
        if (book!=null){
            if(books==null){
                books=new HashSet<>();
            }
            books.add(book);
        }
    }
}

