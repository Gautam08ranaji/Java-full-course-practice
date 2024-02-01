package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class PrintAllEvenDigitsDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input number");

        int x = sc.nextInt();
        int rem = 0;
        while (x>0){

            rem = x%10;
            x /=10;


            if (rem%3==0) {
                System.out.println(rem);
            }}
        }
}
