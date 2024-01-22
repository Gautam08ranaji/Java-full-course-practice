package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class BiggestNumberFrom3Inpiuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 number");
        int a = sc.nextInt();

        System.out.println("Enter 2 number");
        int b = sc.nextInt();

        System.out.println("enter 3 number");
        int c = sc.nextInt();

//        int x =  a>b?a:b;
//        int y = b>c? b : c;
//
//        int result = x>y? x:y;

//              OR

        int result = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(result+": is the biggest number ");
        System.out.println(result+": is the biggest number ");
    }
}
