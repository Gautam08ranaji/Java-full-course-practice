package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int star=1;
        int space =n/2;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            if (i <(n/2)+1) {
                space--;
                star++;
            }
            else {
                space++;
                star--;
            }
            System.out.println();
        }


    }
}
