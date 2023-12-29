
//Write a Java program to find the number of days in a month.
//
//        Test Data
//        Input a month number: 2
//        Input a year: 2016

package com.example.java1mc.IfElse;

import java.util.Scanner;

public class FindNumberOfDaysInMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String NameOfMonth ="";
        int Number_of_DaysInMonths =0;

        System.out.println("Enter number of month");
        int number_of_month = sc.nextInt();

        System.out.println("Enter number of year");
        int year = sc.nextInt();


        switch (number_of_month) {
            case 1 -> {
                NameOfMonth = "JANUARY";
                Number_of_DaysInMonths = 31;
            }
            case 2 -> {
                NameOfMonth = "FEBRUARY";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    Number_of_DaysInMonths = 29;
                } else {
                    Number_of_DaysInMonths = 28;
                }
            }
            case 3 -> {
                NameOfMonth = "MARCH";
                Number_of_DaysInMonths = 31;
            }
            case 4 -> {
                NameOfMonth = "APRIL";
                Number_of_DaysInMonths = 30;
            }
            case 5 -> {
                NameOfMonth = "May";
                Number_of_DaysInMonths = 31;
            }
            case 6 -> {
                NameOfMonth = "JUNE";
                Number_of_DaysInMonths = 30;
            }
            case 7 -> {
                NameOfMonth = "JULY";
                Number_of_DaysInMonths = 31;
            }
            case 8 -> {
                NameOfMonth = "AUGUST";
                Number_of_DaysInMonths = 31;
            }
            case 9 -> {
                NameOfMonth = "SEPTEMBER";
                Number_of_DaysInMonths = 30;
            }
            case 10 -> {
                NameOfMonth = "OCTOBER";
                Number_of_DaysInMonths = 31;
            }
            case 11 -> {
                NameOfMonth = "NOVEMBER";
                Number_of_DaysInMonths = 30;
            }
            case 12 -> {
                NameOfMonth = "DECEMBER";
                Number_of_DaysInMonths = 31;
            }
        }
        System.out.println(NameOfMonth +" "+ year+" " +" has "+ Number_of_DaysInMonths+" Days" );

    }
}

