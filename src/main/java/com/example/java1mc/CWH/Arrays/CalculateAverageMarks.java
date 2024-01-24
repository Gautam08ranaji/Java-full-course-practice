package com.example.java1mc.CWH.Arrays;

import java.util.Scanner;

public class CalculateAverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of studets in physics");

        int marks[]= new int[5];

        int average_marks = 0;
        for (int i = 0; i <marks.length; i++) {
            marks[i]= sc.nextInt();
        }

        for (int i = 0; i <marks.length ; i++) {
            average_marks +=marks[i];
        }

        average_marks /= marks.length;

        System.out.println(average_marks);
    }
}
