package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i  = 1;
        int n =0;
        while (i<=10){
            n = n+i;
            i++;

        }
        System.out.println("the sum of first ten natural numbers are --> "+n);
    }
}
