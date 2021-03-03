package com.bootcamp.FirstProject;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortingAlgorithm {
    public int[] sort(int[] numbers){
        System.out.println("Bubble Sort called");
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (numbers[j] > numbers[j + 1]) {
                    // swap temp and numbers[i]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
        return numbers;
    }
}
