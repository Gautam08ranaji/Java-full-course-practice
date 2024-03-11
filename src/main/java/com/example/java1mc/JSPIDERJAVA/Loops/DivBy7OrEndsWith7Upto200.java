package com.example.java1mc.JSPIDERJAVA.Loops;

import java.util.Scanner;

public class DivBy7OrEndsWith7Upto200 {
    public static void main(String[] args) {


        int i = 1;
        int count=0;


        while (i <= 200) {

            if (i%7==0 && i % 10 == 7) {

                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}