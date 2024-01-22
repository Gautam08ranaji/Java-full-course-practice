package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class DivisibleBy8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number more than two digit");
        int n = sc.nextInt();

        int x = n%100;
        String result =  x%8==0?"Dividible by 8": "not Dividible by 8";
        System.out.println(result);
    }
}
