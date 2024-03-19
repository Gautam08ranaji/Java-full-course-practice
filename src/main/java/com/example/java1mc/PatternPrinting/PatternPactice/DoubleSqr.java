package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class DoubleSqr {
    public static void main(String[] args) {

        getPattern();
    }
    public static void getPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (j == 1||j==n||i==1||i==n || i==2 || j==2 || j==n-1 || i==n-1 || j==(n/2)+1 && i ==(n/2)+1) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
