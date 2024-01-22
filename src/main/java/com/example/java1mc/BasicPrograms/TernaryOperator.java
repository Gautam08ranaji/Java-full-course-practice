package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number");

        int n = sc.nextInt();
//        String s = n >99 && n<999 ? "yes ": "no";
        System.out.println(n >99 && n<999 ? "yes ": 90);
    }
}

