package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class SquareFillPattern {
    public static void main(String[] args) {
        System.out.println("enter number");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println(5);
        }
    }
}
