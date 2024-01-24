package com.example.java1mc.IfElse;

import java.util.Scanner;

public class LowerCaseOrUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input");
        char a = sc.next().charAt(0);

        if (a >= 'a' && a<= 'z' ) {
            System.out.println(a+" is a lower case");
        } else if (a>= 'A' && a<= 'Z') {
            System.out.println(a+" is a upper case");
        }else {
            System.out.println("not a character");
        }
    }
}
