package com.example.java1mc.BasicPrograms;
import java.util.Scanner;
public class Prog {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(" ");
            }
            for (int j = 5; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}