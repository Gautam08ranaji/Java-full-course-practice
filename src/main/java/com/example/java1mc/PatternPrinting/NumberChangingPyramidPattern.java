//  Number Changing Pyramid Pattern

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21

package com.example.java1mc.PatternPrinting;

import java.util.Scanner;

public class NumberChangingPyramidPattern {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("  "+a+"  ");
                a +=1;
            }
            System.out.println("\n");
        }
    }
}
