package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class ReverseRightHalfPyramidPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
