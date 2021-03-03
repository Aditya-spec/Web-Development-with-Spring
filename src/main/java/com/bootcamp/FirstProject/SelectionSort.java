package com.bootcamp.FirstProject;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SelectionSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        System.out.println("Selection Sort called");
        return numbers;
    }
}
