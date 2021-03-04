package com.bootcamp.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(FirstProjectApplication.class, args);
        BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
        System.out.println(binarySearch);
        int result = binarySearch.searchNumber(new int[]{12, 3, 5, 4, 8, 23, 45, 11}, 5);
        System.out.println(result);
    }

}
