//Write a Java program that reads two floating-point numbers and tests whether they are the
// same up to three decimal places.
//
//        Test Data
//        Input floating-point number: 25.586
//        Input floating-point another number: 25.589
//        Output : they are different

package com.example.java1mc.IfElse;

import java.util.Scanner;

public class SameUpTo3DecimalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 1 number");

        double a = sc.nextDouble();

        System.out.println("enter 2 number ");
        double b = sc.nextDouble();

        a = Math.round(a * 1000);
        a = a / 1000;

        b = Math.round(b * 1000);
        b = b / 1000;

        if (a == b) {
            System.out.println("they are same upto 3 digits");
        }
        else System.out.println(" they are different ");

    }
}
