package com.bootcamp.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired
    private SortingAlgorithm sortingAlgorithm;
    @Autowired
    private String name;

    public BinarySearch(SortingAlgorithm sortingAlgorithm, String name) {
        this.sortingAlgorithm = sortingAlgorithm;
        this.name = name;
        System.out.println("Constructor called");
        System.out.println();
    }

    
    

    public int searchNumber(int[] numbers, int number) {

        sortingAlgorithm.sort(numbers);


        //Searching the number

        return 2;
    }
}

