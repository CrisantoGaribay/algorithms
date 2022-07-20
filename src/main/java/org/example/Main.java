package org.example;

import sort.Bubble;
import sort.Selection;

import static sort.Recursion.iterativeFactorial;
import static sort.Recursion.recursiveFactorial;

public class Main {
    public static void main(String[] args) {
        int recursive = recursiveFactorial(3);
        int iterative = iterativeFactorial(3);

        System.out.println(recursive);
        System.out.println(iterative);
    }
}