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
    }

    @Override
    public String toString() {
        return "BinarySearch{" +
                "sortingAlgorithm=" + sortingAlgorithm +
                ", name='" + name + '\'' +
                '}';
    }

//    @Autowired
//    public BinarySearch(SortingAlgorithm sortingAlgorithm) {
//        this.sortingAlgorithm = sortingAlgorithm;
//    }

    public int searchNumber(int[] numbers, int number) {

       sortingAlgorithm.sort(numbers);




        //Searching the number

        return 2;
    }
}

