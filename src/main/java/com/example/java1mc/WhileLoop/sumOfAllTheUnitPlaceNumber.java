package com.example.java1mc.WhileLoop;

import java.util.Scanner;

public class sumOfAllTheUnitPlaceNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input number");

        int x = sc.nextInt();
        int sum = 0;
        int rem = 0;
        while (x > 0) {

            rem = x % 10;
            sum +=rem;
            x /= 10;




        }
        System.out.println("total count is : " + sum);
    }
}
