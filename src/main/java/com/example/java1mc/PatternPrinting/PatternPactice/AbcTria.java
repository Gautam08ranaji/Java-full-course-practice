package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class AbcTria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int x = 65;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print((char)x+" ");

            }
            x++;
            System.out.println();

        }

    }
}
