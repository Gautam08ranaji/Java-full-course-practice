package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class ButterFlyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();


        getPattern(n);
    }

    public static void getPattern(int n) {


        if (n%2 == 0) {
            n+=1;
        }
        int left_star=1;
        int right_star =n;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j <= left_star||j>=right_star) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            if (i < (n/2)+1) {
                left_star++;
                right_star--;
            } else {
                left_star--;
                right_star++;
            }

            System.out.println();
        }

    }
}
