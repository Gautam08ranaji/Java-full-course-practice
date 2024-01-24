package com.example.java1mc.IfElse;

import java.util.Scanner;

public class BiggestOf3Number {
    public static void main(String[] args) {
        int a =16;
        int b = 16;
        int c = 16;


        if (a>b && a>c ){
            System.out.println(a+" is the biggest number");
        } else if (b>c ) {
            System.out.println(b+": is the biggest number");

        } else if (c>b) {
            System.out.println(c+" is the biggest number");
        }else {
            System.out.println("all are equal");
        }
    }
}
