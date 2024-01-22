package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class CheckDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number");
        int a = sc.nextInt();

        String result = (a%8==0 && a%12==0)?a+" yes it is divisibe by both ":a+" not it is bot divisible by both";
        System.out.println(result);


    }
}
