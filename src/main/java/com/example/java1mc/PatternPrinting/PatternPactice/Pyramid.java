package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int space =1;

        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(" ");
                }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
            }

        }
    }
