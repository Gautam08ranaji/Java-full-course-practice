package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class ValidTriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 number");
        int a = sc.nextInt();

        System.out.println("enter 2 number");
        int b = sc.nextInt();

        System.out.println("enter 3 number");
        int c = sc.nextInt();

        String result = (a+b>c && b+c>a && a+c>b)? "Valid": "Not valid";
        System.out.println(result);
    }
}
