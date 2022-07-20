package org.example;

import sort.Bubble;
import sort.Selection;

import java.util.Arrays;

import static sort.Merge.mergeSort;
import static sort.QuickSort.quickSort;
import static sort.Recursion.iterativeFactorial;
import static sort.Recursion.recursiveFactorial;

public class Main {
    static int[] intArray = {20, 35, -15, 7, 55, 1, -22};
    public static void main(String[] args) {
        quickSort(intArray, 0, intArray.length);

        System.out.println(Arrays.toString(intArray));
    }
}