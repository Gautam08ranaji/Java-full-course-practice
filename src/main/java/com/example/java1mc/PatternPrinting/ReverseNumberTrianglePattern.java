package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class ReverseNumberTrianglePattern {
    public static void main(String[] args) {
        System.out.println(" enter number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }
}
