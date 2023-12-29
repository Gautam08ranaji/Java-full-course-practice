package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find factorial ");
        int fact = 1;

        int num = sc.nextInt();
        int i =1;
        while (i <= num ){
           fact = fact * i;
           i++;
        }
        System.out.println(fact);
    }
}
