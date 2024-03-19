package com.example.java1mc.PatternPrinting.PatternPactice;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        getPattern();
    }
    public static void getPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int n = sc.nextInt();
        int star=1;
        int space=n/2;

        if (n%2 == 0) {
            n+=1;
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=space ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=star ; j++) {
                System.out.print("* ");
            }
            if (i<(n/2)+1) {
                space--;
                star+=2;
            } else if (i>=(n/2)+1) {
                space++;
                star-=2;
            }
            System.out.println();
        }

    }
}
