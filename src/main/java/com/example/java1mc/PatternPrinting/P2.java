package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1  ; i <=n; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >=i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
