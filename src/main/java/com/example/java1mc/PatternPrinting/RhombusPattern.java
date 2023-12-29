package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
