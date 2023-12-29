package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i =1;

        System.out.println("Enter the number to generate table ");
        int n = sc.nextInt();

        while (i <= 10){
            System.out.println( n+" * "+i+ " = "+ i*n);
            i++;
        }
    }
}
