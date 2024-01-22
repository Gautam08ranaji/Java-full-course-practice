package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character");
        char a = sc.next().charAt(0);

        String s = (a>='a'&& a <='z' || a>= 'A' && a<='Z')?"Alphabet": " not alphabet";
        System.out.println(s);
    }
}
