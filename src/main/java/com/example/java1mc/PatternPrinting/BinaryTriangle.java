package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                sum = i+j;
                if (sum %2==0) {
                    System.out.print(1+" ");
                }else {
                    System.out.print(0+" ");
                }
            }System.out.println();
        }
    }
}
