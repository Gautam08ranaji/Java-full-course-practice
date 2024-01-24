package com.example.java1mc.IfElse;

import java.util.Scanner;

public class DivisibleBt5And11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input");
        int x = sc.nextInt();

        if (x % 5== 0 && x % 11 ==0) {
            System.out.println(x+": is divisibe by both");
        }else {
            System.out.println("not divisible");
        }
    }
}
