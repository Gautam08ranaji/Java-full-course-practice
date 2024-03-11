package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class BinTria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num =1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i; j++) {

                if ((num+1)%2 == 0) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
                num++;
            }
            System.out.println();
        }
    }
}
