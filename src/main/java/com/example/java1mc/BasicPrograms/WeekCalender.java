package com.example.java1mc.BasicPrograms;

import java.util.Scanner;

public class WeekCalender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enteer the number");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 7 -> System.out.println("SUNDAY");
            default -> System.out.println("enter number between 1 to 7");
        }
    }
}
