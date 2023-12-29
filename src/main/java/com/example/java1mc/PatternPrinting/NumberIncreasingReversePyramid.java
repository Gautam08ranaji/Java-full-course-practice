//      Number  Increasing  Reverse Pyramid
//        1  2  3  4  5
//        1  2  3  4
//        1  2  3
//        1  2
//        1
        package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class NumberIncreasingReversePyramid {
    public static void main(String[] args) {

        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }

    }
}
