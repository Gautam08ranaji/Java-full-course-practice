package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 65;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
