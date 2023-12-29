//1. Write a Java program to get a number from the user and print whether it is positive or negative.
//
//        Test Data
//        Input number: 35
//        Expected Output :
//        Number is positive

package com.example.java1mc.IfElse;

import java.util.Scanner;

public class CheckNumberNegativePositive {
    public static void main(String[] args) {

        System.out.println("Enter any number you want positive or negative ");
        Scanner sc = new Scanner(System.in);

        int number_input = sc.nextInt();

        if (number_input == 0) {
            System.out.println("Number is Zero ");
        } else if (number_input > 0) {
            System.out.println(number_input+" Number is Positive ");
        }else {
            System.out.println(number_input+" NUmber is negative");
        }

    }
}
