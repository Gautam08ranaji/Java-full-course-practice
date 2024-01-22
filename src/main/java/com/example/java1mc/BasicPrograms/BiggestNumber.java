package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 number");
        int n1 = sc.nextInt();

        System.out.println("enter 2 number");
        int n2 = sc.nextInt();

        int result = n1 > n2? n1 : n2;
        System.out.print(result);
        System.out.println(" is the biggest number");
    }
}
