package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class OddBinaryTrianglr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }
}
