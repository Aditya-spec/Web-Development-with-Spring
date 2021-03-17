package com.example.Jpa.Hibernate.Part3.JPA3;

import com.example.Jpa.Hibernate.Part3.JPA3.Services.AuthorService;
import com.example.Jpa.Hibernate.Part3.JPA3.Services.BidirectionalService;
import com.example.Jpa.Hibernate.Part3.JPA3.Services.ManyToManyService;
import com.example.Jpa.Hibernate.Part3.JPA3.Services.UnidirectionalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Jpa3Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Jpa3Application.class, args);
        AuthorService authorService = applicationContext.getBean(AuthorService.class);
        BidirectionalService bidirectionalService = applicationContext.getBean(BidirectionalService.class);
        UnidirectionalService unidirectionalService=applicationContext.getBean(UnidirectionalService.class);
        ManyToManyService manyToManyService=applicationContext.getBean(ManyToManyService.class);
        authorService.createAuthorInstance();
       // bidirectionalService.createBidirectionalInstance();
        //unidirectionalService.setData();
        //manyToManyService.createManyToMany();
    }

}
