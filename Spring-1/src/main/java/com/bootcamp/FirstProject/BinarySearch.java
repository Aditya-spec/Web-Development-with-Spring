package com.bootcamp.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    private SortingAlgorithm sortingAlgorithm;

    @Autowired
    public BinarySearch(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int searchNumber(int[] numbers, int number) {

       sortingAlgorithm.sort(numbers);




        //Searching the number

        return 2;
    }
}

