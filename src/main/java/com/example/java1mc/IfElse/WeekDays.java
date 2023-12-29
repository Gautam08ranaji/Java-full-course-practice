//. Write a Java program that takes a number from the user and generates an integer between
// 1 and 7. It displays the weekday name.
//
//        Test Data
//        Input number: 3
//        Expected Output :
//        Wednesday

package com.example.java1mc.IfElse;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number between 1 to 7 ");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("Monday");
        }
        else if (a == 2) {
            System.out.println("Tuesday");
        }
        else if (a == 3) {
            System.out.println("Wednesday");
        }
        else if (a == 4) {
            System.out.println("Thursday");
        }
        else if (a == 5) {
            System.out.println("Friday");
        }
        else if (a == 6) {
            System.out.println("Saturday");
        }
        else System.out.println("Sunday");
    }
}
